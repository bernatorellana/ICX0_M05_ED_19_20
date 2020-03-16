package refactoring;

/**
 *
 * @author bernat
 */
public class StatementReportTxt extends StatementReport {

    @Override
    public String getHeader(Customer client) {
        return "Rental Record for " + client.getName() + "\n";
    }

    @Override
    public String getLine(Rental r) {
        return "\t" + r.getMovie().getTitle() + "\t" + String.valueOf(r.getAmount()) + "\n";
    }

    @Override
    public String getFooter(Customer client) {
        String result = "Amount owed is " + String.valueOf(client.getOwedAmount()) + "\n";
        result += "You earned " + String.valueOf(client.getFrequentRenterPoints()) + " frequent renter points";
        return result;
    }
    
}
