package pokemonList;

import pokemon.CourbeXp;
import pokemon.Nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Salameche extends Pokemon {

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
        List<Integer> stat = new ArrayList<Integer>(Arrays.asList(39, 52, 43, 60, 50, 65));
        int courbeXp = 1;

        Salameche.createPokemon(salameche, name, level, stat, iv, nature, courbeXp);

        return salameche;
    }
}
