package pokemonList;

import pokemon.CourbeXp;
import pokemon.Nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bulbizarre extends Pokemon {

    public static final List<Integer> BASE_STATISTICS_LEVEL_1 = new ArrayList<Integer>(Arrays.asList(45, 49, 49, 65, 65, 45));
    public static final int COURBE_XP = 1;
    protected Bulbizarre() {
        super();
    }

    protected Bulbizarre(String defaultName,
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

    public static Bulbizarre createPokemon() {
        List<Integer> iv = new ArrayList<Integer>(Arrays.asList(31, 31, 31, 31, 31, 31));

        Bulbizarre bulbizarre = new Bulbizarre();
        Bulbizarre.createPokemon(bulbizarre, "Bulbizarre", 100, iv, 1);

        return bulbizarre;
    }

    public static Bulbizarre createPokemon(Bulbizarre bulbizarre, String name, int level, List<Integer> iv, int nature) {
        Bulbizarre.createPokemon(bulbizarre, name, level, BASE_STATISTICS_LEVEL_1, iv, nature, COURBE_XP);

        return bulbizarre;
    }
}
