package pokemonList;

import pokemon.CourbeXp;
import pokemon.Nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carapuce extends Pokemon {

    public static final List<Integer> BASE_STATISTICS_LEVEL_1 = new ArrayList<Integer>(Arrays.asList(44, 48, 65, 50, 64, 43));

    public static final int COURBE_XP = 1;

    public static final int LEVEL_TO_EVOLVE = 16;
    private Carapuce() {
        super();
    }

    private Carapuce(String defaultName,
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

    public static Carapuce createPokemon() {
        List<Integer> iv = new ArrayList<Integer>(Arrays.asList(31, 31, 31, 31, 31, 31));

        Carapuce carapuce = new Carapuce();
        Carapuce.createPokemon(carapuce, "Carapuce", 100, iv, 1);

        return carapuce;
    }

    public static Carapuce createPokemon(Carapuce carapuce, String name, int level, List<Integer> iv, int nature) {
        Carapuce.createPokemon(carapuce, name, level, Carapuce.BASE_STATISTICS_LEVEL_1, iv, nature, Carapuce.COURBE_XP);

        return carapuce;
    }
}
