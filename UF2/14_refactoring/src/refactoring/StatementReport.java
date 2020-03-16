package refactoring;

/**
 *
 * @author bernat
 */
public abstract class StatementReport {
 
    public String getReport(Customer client) {
        String report;
        
        report = getHeader(client);
        for(Rental rental : client.getRentals()){
            report += getLine(rental);
        }
        report += getFooter(client);
        return report;
    }

    public abstract String getHeader(Customer client);
    public abstract String getLine(Rental r);
    public abstract String getFooter(Customer client);

}

