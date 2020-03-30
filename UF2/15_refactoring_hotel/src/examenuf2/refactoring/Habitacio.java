package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public abstract class Habitacio {

//    public static final int DOBLE = 0;
//    public static final int TRIPLE = 1;
//    public static final int SUITE = 2;
//
    private int codi;
    private EnumTipusHabitacio tipusHabitacio;

    public Habitacio(int codi, EnumTipusHabitacio tipusHabitacio) {
        this.codi = codi;
        this.tipusHabitacio = tipusHabitacio;
    }

    public int getCodi() {
        return codi;
    }

    public EnumTipusHabitacio getTipusHabitacio() {
        return tipusHabitacio;
    }
    
    abstract int getPreu();
    
    abstract double getRecarrecIndividual();

    abstract String getDescTipus();


}
