package pokemonList;

import pokemon.CourbeXp;
import pokemon.Nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Herbizarre extends Bulbizarre {

    public static final List<Integer> BASE_STATISTICS_LEVEL_1 = new ArrayList<Integer>(Arrays.asList(60, 62, 63, 80, 80, 60));

    protected Herbizarre() {
        super();
    }

    protected Herbizarre(String defaultName,
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

    public static Herbizarre createPokemon() {
        List<Integer> iv = new ArrayList<Integer>(Arrays.asList(31, 31, 31, 31, 31, 31));

        Herbizarre herbizarre = new Herbizarre();
        Herbizarre.createPokemon(herbizarre, "Herbizarre", 100, iv, 1);

        return herbizarre;
    }

    public static Herbizarre createPokemon(Herbizarre herbizarre, String name, int level, List<Integer> iv, int nature) {
        Herbizarre.createPokemon(herbizarre, name, level, BASE_STATISTICS_LEVEL_1, iv, nature, COURBE_XP);

        return herbizarre;
    }
}
