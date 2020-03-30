
package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public class HabitacioDoble extends Habitacio{

    public HabitacioDoble(int codi) {
        super(codi, EnumTipusHabitacio.DOBLE);
    }

    @Override
    int getPreu() {
        return 85;
    }

    @Override
    double getRecarrecIndividual() {
        return 50;
    }

    @Override
    String getDescTipus() {
        return "doble";
    }
}
