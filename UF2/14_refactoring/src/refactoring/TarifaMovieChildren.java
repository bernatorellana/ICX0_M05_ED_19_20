package refactoring;

/**
 *
 * @author Usuari
 */
public class TarifaMovieChildren extends TarifaMovie {

    @Override
    public double getPrice(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }

}
