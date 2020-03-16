package refactoring;

// From book: 'Refactoring' by Martin Fowler
// This is the original code before refactoring begins
public class Movie {

    private String _title;
    private TipusTarifa _priceCode;
    private TarifaMovie _tarifa;

    public Movie(String title, TipusTarifa tarifa) {
        _title = title;
        setPriceCode(tarifa);
    }

    public TipusTarifa getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(TipusTarifa tarifa) {
        _priceCode = tarifa;
        switch(tarifa) {            
            case CHILDRENS:     _tarifa = new TarifaMovieChildren(); break;
            case NEW_RELEASE:   _tarifa = new TarifaMovieNewRelease(); break;
            case REGULAR:       _tarifa = new TarifaMovieRegular(); break;            
        }      
    }

    public String getTitle() {
        return _title;
    }

    double getPrice(int daysRented) {
        return _tarifa.getPrice(daysRented);
    }
 
}
