package refactoring;

// From book: 'Refactoring' by Martin Fowler
// This is the original code before refactoring begins
public class Movie {

    private String _title;
    private TipusTarifa _tipusTarifa;
    private TarifaMovie _tarifa;

    public Movie(String title, TipusTarifa tarifa) {
        _title = title;
        setPriceCode(tarifa);
    }

    public TipusTarifa getPriceCode() {
        return _tipusTarifa;
    }

    public void setPriceCode(TipusTarifa tipusTarifa) {
        _tipusTarifa = tipusTarifa;
        _tarifa = tipusTarifa.getTarificador();
    }

    public String getTitle() {
        return _title;
    }

    double getPrice(int daysRented) {
        return _tarifa.getPrice(daysRented);
    } 
}
