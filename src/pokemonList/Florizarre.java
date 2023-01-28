package pokemonList;

import pokemon.CourbeXp;
import pokemon.Nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Florizarre extends Herbizarre {

    public static final List<Integer> BASE_STATISTICS_LEVEL_1 = new ArrayList<Integer>(Arrays.asList(80, 82, 83, 100, 100, 80));

    protected Florizarre() {
        super();
    }

    protected Florizarre(String defaultName,
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
        super(defaultName,
                encounterLevel,
                baseStatisticsLevel1,
                iv,
                ev,
                courbeXp,
                nature,
                currentName,
                currentLevel,
                currentXp,
                currentStatistics,
                totalEv);
    }

    public static Florizarre createPokemon() {
        List<Integer> iv = new ArrayList<Integer>(Arrays.asList(31, 31, 31, 31, 31, 31));

        Florizarre florizarre = new Florizarre();
        Florizarre.createPokemon(florizarre, "Florizarre", 100, iv, 1);

        return florizarre;
    }

    public static Florizarre createPokemon(Florizarre florizarre, String name, int level, List<Integer> iv, int nature) {
        Florizarre.createPokemon(florizarre, name, level, Florizarre.BASE_STATISTICS_LEVEL_1, iv, nature, Florizarre.COURBE_XP);

        return florizarre;
    }
}
