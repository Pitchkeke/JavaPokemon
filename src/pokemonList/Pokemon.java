package pokemonList;

import pokemon.CourbeXp;
import pokemon.Nature;
import pokemon.PokemonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pokemon {

    // Constantes

    public static final int MIN_LEVEL = 1;
    public static final int MAX_LEVEL = 100;

    public static final int MIN_IV  = 0;
    public static final int MAX_IV  = 31;

    public static final int MIN_EV  = 0;
    public static final int MAX_EV  = 252;

    public static final int MIN_STAT = 1;

    public static final int MAX_NAME_SIZE = 25;

    // Attributs

    private String defaultName;
    private int encounterLevel;
    private List<Integer> baseStatisticsLevel1;
    private List<Integer> iv;
    private List<Integer> ev;

    private CourbeXp courbeXp;
    private Nature nature;

    private String currentName;
    private int currentLevel;
    private int currentXp;
    private List<Integer> currentStatistics;
    private int totalEv;

    // Constructeurs

    protected Pokemon() {

    }

    public Pokemon(String defaultName,
                   int encounterLevel,
                   List<Integer> baseStatisticsLevel1,
                   List<Integer> iv,
                   List<Integer> ev,
                   CourbeXp courbeXp,
                   Nature nature,
                   String currentName,
                   int currentLevel,
                   int currentXp,
                   List<Integer> currentStatistics,
                   int totalEv) {
        this.defaultName = defaultName;
        this.encounterLevel = encounterLevel;
        this.baseStatisticsLevel1 = baseStatisticsLevel1;
        this.iv = iv;
        this.ev = ev;
        this.courbeXp = courbeXp;
        this.nature = nature;
        this.currentName = currentName;
        this.currentLevel = currentLevel;
        this.currentXp = currentXp;
        this.currentStatistics = currentStatistics;
        this.totalEv = totalEv;
    }

    // Getters et Setters

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    public int getEncounterLevel() {
        return encounterLevel;
    }

    public void setEncounterLevel(int encounterLevel) {
        this.encounterLevel = encounterLevel;
    }

    public List<Integer> getBaseStatisticsLevel1() {
        return baseStatisticsLevel1;
    }

    public void setBaseStatisticsLevel1(List<Integer> baseStatisticsLevel1) {
        this.baseStatisticsLevel1 = baseStatisticsLevel1;
    }

    public List<Integer> getIv() {
        return iv;
    }

    public void setIv(List<Integer> iv) {
        this.iv = iv;
    }

    public List<Integer> getEv() {
        return ev;
    }

    public void setEv(List<Integer> ev) {
        this.ev = ev;
    }

    public CourbeXp getCourbeXp() {
        return courbeXp;
    }

    public void setCourbeXp(CourbeXp courbeXp) {
        this.courbeXp = courbeXp;
    }

    public Nature getNature() {
        return nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getCurrentXp() {
        return currentXp;
    }

    public void setCurrentXp(int currentXp) {
        this.currentXp = currentXp;
    }

    public List<Integer> getCurrentStatistics() {
        return currentStatistics;
    }

    public void setCurrentStatistics(List<Integer> currentStatistics) {
        this.currentStatistics = currentStatistics;
    }

    public int getTotalEv() {
        return totalEv;
    }

    public void setTotalEv(int totalEv) {
        this.totalEv = totalEv;
    }

    // Méthodes

    public static void createPokemon(Pokemon pokemon, String name, int level, List<Integer> baseStat, List<Integer> iv, int nature, int courbeXp) {
        try {
            if (!PokemonUtils.isNameCorrect(name)) {
                throw new Exception("Le nom n'est pas correct : "+name);
            }
            if (!PokemonUtils.isLevelCorrect(level)) {
                throw new Exception("Le niveau n'est pas correct : "+level);
            }
            if (!PokemonUtils.isStatisticsCorrect(baseStat))
            {
                throw new Exception("Les statistiques ne sont pas correct : "+baseStat);
            }
            if (!PokemonUtils.isIvCorrect(iv))
            {
                throw new Exception("Les iv ne sont pas correct : "+iv);
            }
            if (!PokemonUtils.isNatureCodeCorrect(nature)) {
                throw new Exception("La nature n'est pas correct : "+nature);
            }

            CourbeXp courbe = CourbeXp.findCourbeXp(courbeXp);

            Nature nat = Nature.findNature(nature);
            List<Integer> stat = new ArrayList<Integer>();

            for (int i = 0; i < baseStat.size(); i++) {
                stat.add(Pokemon.calculStat(i, level, baseStat.get(i), iv.get(i), 0, (i == 0 ? 1 : nat.getStatChanged().get(i-1))));
            }

            List<Integer> ev = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));

            pokemon.setDefaultName(name);
            pokemon.setEncounterLevel(level);;
            pokemon.setBaseStatisticsLevel1(baseStat);
            pokemon.setIv(iv);
            pokemon.setEv(ev);
            pokemon.setCourbeXp(courbe);
            pokemon.setNature(nat);
            pokemon.setCurrentName(name);
            pokemon.setCurrentLevel(level);
            pokemon.setCurrentXp(0);
            pokemon.setCurrentStatistics(stat);
            pokemon.setTotalEv(0);

            //pokemon = new Pokemon(name, level, baseStat, iv, ev, courbe, nat, name, level, 0, stat, 0);
        } catch (Exception e) {
            System.out.println("Erreur à la création d'un Pokemon : "+e);
        }

        //return pokemon;
    }

    public static int calculStat(int index, int level, int baseStat, int iv, int ev, Double nature) {
        int statValue = -1;

        try {
            if (index < 0 || index > 5) {
                throw new Exception("L'index n'est pas valide : "+index);
            }
            if (!PokemonUtils.isStatisticsCorrect(baseStat))
            {
                throw new Exception("Les statistiques ne sont pas correct : "+baseStat);
            }
            if (!PokemonUtils.isIvCorrect(iv))
            {
                throw new Exception("Les iv ne sont pas correct : "+iv);
            }
            if (!PokemonUtils.isLevelCorrect(level)) {
                throw new Exception("Le niveau n'est pas correct : "+level);
            }

            if (index == 0) {
                statValue = level + 10 + (level * (2 * baseStat + iv + (ev/4))/100);

            } else {
                if (!PokemonUtils.isNatureValueCorrect(nature)) {
                    throw new Exception("La valeur de nature n'est pas correct : "+nature);
                }

                statValue = (int)(nature  * (5 + (level * (2 * baseStat + iv + (ev/4))/100)));
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de la modification des stat du pokemon : "+e);
        }

        return statValue;
    }

    @Override
    public String toString() {
        return "Pokemon [defaultName=" + defaultName + ", encounterLevel=" + encounterLevel + ", baseStatisticsLevel1="
                + baseStatisticsLevel1 + ", iv=" + iv + ", ev=" + ev + ", courbeXp=" + courbeXp + ", nature=" + nature
                + ", currentName=" + currentName + ", currentLevel=" + currentLevel + ", currentXp=" + currentXp
                + ", currentStatistics=" + currentStatistics + ", totalEv=" + totalEv + "]";
    }

}
