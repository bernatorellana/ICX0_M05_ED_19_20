package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public class HabitacioTriple extends Habitacio {

    public HabitacioTriple(int codi) {
        super(codi, EnumTipusHabitacio.TRIPLE);
    }

    @Override
    int getPreu() {
        return 120;
    }

    @Override
    double getRecarrecIndividual() {
        return 80;
    }

    @Override
    String getDescTipus() {
        return "triple";
    }
    
}
