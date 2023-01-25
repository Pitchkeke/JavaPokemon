package pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nature {

    // Constantes

    public final static double DECREASE_VALUE = 0.9;
    public final static double INCREASE_VALUE = 1.1;

    public final static int ASSURE = 1;
    public final static int BIZARRE = 2;
    public final static int BRAVE = 3;
    public final static int CALME = 4;
    public final static int DISCRET = 5;
    public final static int DOCILE = 6;
    public final static int DOUX = 7;
    public final static int FOUFOU = 8;
    public final static int GENTIL = 9;
    public final static int HARDI = 10;
    public final static int JOVIAL = 11;
    public final static int LACHE = 12;
    public final static int MALIN = 13;
    public final static int MALPOLI = 14;
    public final static int MAUVAIS = 15;
    public final static int MODESTE = 16;
    public final static int NAIF = 17;
    public final static int PRESSE = 18;
    public final static int PRUDENT = 19;
    public final static int PUDIQUE = 20;
    public final static int RELAX = 21;
    public final static int RIGIDE = 22;
    public final static int SERIEUX = 23;
    public final static int SOLO = 24;
    public final static int TIMIDE = 25;

    // Attributs

    private String name;
    private List<Double> statChanged;

    // Constructeurs

    private Nature() {

    }

    private Nature(String name, List<Double> statChanged) {
        this.name = name;
        this.statChanged = statChanged;
    }

    // Getters et setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getStatChanged() {
        return statChanged;
    }

    public void setStatChanged(List<Double> statChanged) {
        this.statChanged = statChanged;
    }

    // Méthodes

    public static Nature findNature(int nature) {
        return switch (nature) {
            case ASSURE -> new Nature("Assuré", new ArrayList<>(Arrays.asList(
                    DECREASE_VALUE,
                    INCREASE_VALUE,
                    1.,
                    1.,
                    1.)));
            case BRAVE -> new Nature("Brave", new ArrayList<>(Arrays.asList(
                    INCREASE_VALUE,
                    1.,
                    1.,
                    1.,
                    INCREASE_VALUE)));
            case CALME -> new Nature("Calme", new ArrayList<>(Arrays.asList(
                    DECREASE_VALUE,
                    1.,
                    1.,
                    INCREASE_VALUE,
                    1.)));
            case DISCRET -> new Nature("Discret", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    INCREASE_VALUE,
                    1.,
                    DECREASE_VALUE)));
            case DOUX -> new Nature("Doux", new ArrayList<>(Arrays.asList(
                    1.,
                    DECREASE_VALUE,
                    INCREASE_VALUE,
                    1.,
                    1.)));
            case FOUFOU -> new Nature("Foufou", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    INCREASE_VALUE,
                    DECREASE_VALUE,
                    1.)));
            case GENTIL -> new Nature("Gentil", new ArrayList<>(Arrays.asList(
                    1.,
                    DECREASE_VALUE,
                    1.,
                    INCREASE_VALUE,
                    1.)));
            case JOVIAL -> new Nature("Jovial", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    DECREASE_VALUE,
                    1.,
                    INCREASE_VALUE)));
            case LACHE -> new Nature("Lâche", new ArrayList<>(Arrays.asList(
                    1.,
                    INCREASE_VALUE,
                    1.,
                    DECREASE_VALUE,
                    1.)));
            case MALIN -> new Nature("Malin", new ArrayList<>(Arrays.asList(
                    1.,
                    INCREASE_VALUE,
                    DECREASE_VALUE,
                    1.,
                    1.)));
            case MALPOLI -> new Nature("Malpoli", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    1.,
                    INCREASE_VALUE,
                    DECREASE_VALUE)));
            case MAUVAIS -> new Nature("Mauvais", new ArrayList<>(Arrays.asList(
                    INCREASE_VALUE,
                    1.,
                    1.,
                    DECREASE_VALUE,
                    1.)));
            case MODESTE -> new Nature("Modeste", new ArrayList<>(Arrays.asList(
                    DECREASE_VALUE,
                    1.,
                    INCREASE_VALUE,
                    1.,
                    1.)));
            case NAIF -> new Nature("Naïf", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    1.,
                    DECREASE_VALUE,
                    INCREASE_VALUE)));
            case PRESSE -> new Nature("Pressé", new ArrayList<>(Arrays.asList(
                    1.,
                    DECREASE_VALUE,
                    1.,
                    1.,
                    INCREASE_VALUE)));
            case PRUDENT -> new Nature("Prudent", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    DECREASE_VALUE,
                    INCREASE_VALUE,
                    1.)));
            case RELAX -> new Nature("Relax", new ArrayList<>(Arrays.asList(
                    1.,
                    INCREASE_VALUE,
                    1.,
                    1.,
                    DECREASE_VALUE)));
            case RIGIDE -> new Nature("Rigide", new ArrayList<>(Arrays.asList(
                    INCREASE_VALUE,
                    1.,
                    DECREASE_VALUE,
                    1.,
                    1.)));
            case SOLO -> new Nature("Solo", new ArrayList<>(Arrays.asList(
                    INCREASE_VALUE,
                    DECREASE_VALUE,
                    1.,
                    1.,
                    1.)));
            case TIMIDE -> new Nature("Timide", new ArrayList<>(Arrays.asList(
                    DECREASE_VALUE,
                    1.,
                    1.,
                    1.,
                    INCREASE_VALUE)));
            case BIZARRE -> new Nature("Bizarre", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    1.,
                    1.,
                    1.)));
            case DOCILE -> new Nature("Docile", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    1.,
                    1.,
                    1.)));
            case HARDI -> new Nature("Hardi", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    1.,
                    1.,
                    1.)));
            case PUDIQUE -> new Nature("Pudique", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    1.,
                    1.,
                    1.)));
            case SERIEUX -> new Nature("Sérieux", new ArrayList<>(Arrays.asList(
                    1.,
                    1.,
                    1.,
                    1.,
                    1.)));
            default -> null;
        };
    }

    @Override
    public String toString() {
        return "Nature [name=" + name + ", statChanged=" + statChanged + "]";
    }

}
