package refactoring;

/**
 *
 * @author Usuari
 */
public class TarifaMovieRegular  extends TarifaMovie {
    
    @Override
    public double getPrice(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }

}
