package pokemonList;

import pokemon.CourbeXp;
import pokemon.Nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bulbizarre extends Pokemon {

    private Bulbizarre() {
        super();
    }

    private Bulbizarre(String defaultName,
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
        List<Integer> stat = new ArrayList<Integer>(Arrays.asList(45, 49, 49, 65, 65, 45));
        List<Integer> iv = new ArrayList<Integer>(Arrays.asList(31, 31, 31, 31, 31, 31));

        Bulbizarre bulbizarre = new Bulbizarre();
        createPokemon(bulbizarre, "Bulbizarre", 100, stat, iv, 1, 0);

        return bulbizarre;
    }
}
