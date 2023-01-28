package pokemonList;

import pokemon.CourbeXp;
import pokemon.Nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Salameche extends Pokemon {

    public static final List<Integer> BASE_STATISTICS_LEVEL_1 = new ArrayList<Integer>(Arrays.asList(39, 52, 43, 60, 50, 65));

    public static final int COURBE_XP = 1;

    public static final int LEVEL_TO_EVOLVE = 16;
    private Salameche() {
        super();
    }

    private Salameche(String defaultName,
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

    public static Salameche createPokemon() {
        List<Integer> iv = new ArrayList<Integer>(Arrays.asList(31, 31, 31, 31, 31, 31));

        Salameche salameche = new Salameche();
        Salameche.createPokemon(salameche, "Salamèche", 100, iv, 1);

        return salameche;
    }

    public static Salameche createPokemon(Salameche salameche, String name, int level, List<Integer> iv, int nature) {
        Salameche.createPokemon(salameche, name, level, Salameche.BASE_STATISTICS_LEVEL_1, iv, nature, Salameche.COURBE_XP);

        return salameche;
    }
}
