
package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public class HabitacioSuite extends Habitacio{

    public HabitacioSuite(int codi) {
        super(codi, EnumTipusHabitacio.SUITE);
    }

    @Override
    int getPreu() {
        return 600;
    }

    @Override
    double getRecarrecIndividual() {
        return 0;
    }

    @Override
    String getDescTipus() {
         return "suite";
    }
    
}
