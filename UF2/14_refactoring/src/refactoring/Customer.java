package refactoring;

import java.util.Iterator;
import java.util.LinkedList;

//From book: 'Refactoring' by Martin Fowler
//This is the original code before refactoring begins
public class Customer {

    private String _name;
    private LinkedList<Rental> _rentals = new LinkedList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        StatementReportTxt report = new StatementReportTxt();
        return report.getReport(this);        
    }
    
    public double getOwedAmount(){
        double totalAmount = 0;
        for (Rental rental : _rentals) {
            totalAmount += rental.getAmount();
        }
        return totalAmount;
    }
    public int getFrequentRenterPoints(){
        int frequentRenterPoints = 0;
        for (Rental rental : _rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();           
        }
        return frequentRenterPoints;
    }

    Iterable<Rental> getRentals() {
        return _rentals;
    }
    
}
