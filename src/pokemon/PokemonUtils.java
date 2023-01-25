package pokemon;

import pokemonList.Pokemon;

import java.util.List;

public class PokemonUtils {

    // Méthodes

    public static boolean isStatCorrect(List<Integer> stat, Integer min, Integer max) {
        return (stat != null && stat.size() == 6 && stat.stream().allMatch(value -> value >= min && (max == null || value <= max)));
        //return (stat != null && stat.size() == 6 && stat.stream().allMatch(value -> value >= min && (max != null ? value <= max : true)));
    }

    public static boolean isStatCorrect(Integer stat, Integer min, Integer max) {
        return (stat != null && stat >= min && (max == null || stat <= max));
        //return (stat != null && stat >= min && (max != null ?  stat <= max : true));
    }

    public static boolean isStatisticsCorrect(List<Integer> stat) {
        return isStatCorrect(stat, Pokemon.MIN_STAT, null);
    }

    public static boolean isStatisticsCorrect(Integer stat) {
        return isStatCorrect(stat, Pokemon.MIN_STAT, null);
    }

    public static boolean isIvCorrect(List<Integer> iv) {
        return isStatCorrect(iv, Pokemon.MIN_IV, Pokemon.MAX_IV);
    }

    public static boolean isIvCorrect(Integer iv) {
        return isStatCorrect(iv, Pokemon.MIN_IV, Pokemon.MAX_IV);
    }

    public static boolean isEvCorrect(List<Integer> ev) {
        return isStatCorrect(ev, Pokemon.MIN_EV, Pokemon.MAX_EV);
    }

    public static boolean isEvCorrect(Integer ev) {
        return isStatCorrect(ev, Pokemon.MIN_EV, Pokemon.MAX_EV);
    }

    public static boolean isLevelCorrect(int level) {
        return (level >= Pokemon.MIN_LEVEL && level <= Pokemon.MAX_LEVEL);
    }

    public static boolean isNameCorrect(String name) {
        return (name != null && !name.isBlank() && name.length() > 0 && name.length() < Pokemon.MAX_NAME_SIZE);
    }

    public static boolean isNatureCodeCorrect(int nature) {
        return (nature >= 1 && nature <= 25);
    }

    public static boolean isNatureValueCorrect(Double nature) {
        return (nature == 1. || nature == Nature.DECREASE_VALUE || nature == Nature.INCREASE_VALUE);
    }

}
