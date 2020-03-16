
package refactoring;

/**
 *
 * @author bernat
 */
public class StatementReportHTML  extends StatementReport {

    @Override
    public String getHeader(Customer client) {
        return "<html><body> <h1>Rental Record for " + client.getName() + "\n</h1> <ul>";
    }

    @Override
    public String getLine(Rental r) {
        return "<li>\t" + r.getMovie().getTitle() + "\t" + String.valueOf(r.getAmount()) + "\n </li>";
    }

    @Override
    public String getFooter(Customer client) {
        String result = "</ul> <div>Amount owed is " + String.valueOf(client.getOwedAmount()) + "\n";
        result += "You earned " + String.valueOf(client.getFrequentRenterPoints()) + " frequent renter points</div></body></html>";
        return result;
    }
    
}
