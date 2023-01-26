package pokemonList;

import pokemon.CourbeXp;
import pokemon.Nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carapuce extends Pokemon {

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
        List<Integer> stat = new ArrayList<Integer>(Arrays.asList(44, 48, 65, 50, 64, 43));
        int courbeXp = 1;

        Carapuce.createPokemon(carapuce, name, level, stat, iv, nature, courbeXp);

        return carapuce;
    }
}
