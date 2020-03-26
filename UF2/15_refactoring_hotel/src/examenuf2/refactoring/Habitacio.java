package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public class Habitacio {

    public static final int DOBLE = 0;
    public static final int TRIPLE = 1;
    public static final int SUITE = 2;

    private int codi;
    private int tipusHabitacio;

    public Habitacio(int codi, int tipusHabitacio) {
        this.codi = codi;
        this.tipusHabitacio = tipusHabitacio;
    }

    public int getCodi() {
        return codi;
    }

    public int getTipusHabitacio() {
        return tipusHabitacio;
    }

    int getPreu() {
        switch (tipusHabitacio) {
            case DOBLE:
                return 85;
            case TRIPLE:
                return 120;
            case SUITE:
                return 600;
        }
        throw new RuntimeException("Tipus d'habitació no v?lid");
    }

    double getRecarrecIndividual() {
        switch (tipusHabitacio) {
            case DOBLE:
                return 50;
            case TRIPLE:
                return 80;
            case SUITE:
                return 0;
        }
        throw new RuntimeException("Tipus d'habitació no v?lid");
    }

    String getDescTipus() {
        String tipusHab = "";
        if (getTipusHabitacio() == Habitacio.DOBLE) {
            tipusHab = "doble";
        } else if (getTipusHabitacio() == Habitacio.TRIPLE) {
            tipusHab = "triple";
        } else {
            tipusHab = "suite";
        }
        return tipusHab;
    }

}
