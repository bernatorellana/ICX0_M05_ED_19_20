package refactoring;

/**
 *
 * @author Usuari
 */
public class TarifaMovieNewRelease  extends TarifaMovie {


    @Override
    public double getPrice(int daysRented) {
        return daysRented * 3;
    }
    
}
