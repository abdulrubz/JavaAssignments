import edu.duke.*;
import org.apache.commons.csv.*;

public class CSVAssignment {
    public String countryInfo(CSVParser parser, String country) {
        for(CSVRecord record : parser) {
            String countries = record.get("Country");

            if(countries.contains(country)) {
                String export = record.get("Exports");
                //String value = record.get("Values (dollars)");
                String info = country + ":" + export + ":";
                return info;
            }
        }
        return "NOT FOUND";
    }

    public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
        for(CSVRecord record : parser ) {
            String exports = record.get("Exports");
            if(exports.contains(exportItem1) && exports.contains(exportItem2)) {
                String country = record.get("Country");
                System.out.println(country);
            }
        }
    }

    public int numberOfExporters(CSVParser parser, String exportItem) {
        int numOfExporters = 0;
        for(CSVRecord record : parser ) {
            String exports = record.get("Exports");
            if(exports.contains(exportItem)) {
                numOfExporters++;
            }
        }
        return numOfExporters;
    }

    public void bigExporters(CSVParser parser, String amount) {
        for(CSVRecord record : parser) {
            String value = record.get("Value (dollars)");
            String country = record.get("Country");
            if(value.length() > amount.length()) {
                System.out.println(country + " : "+value);
            }
        }
    }

    public static void main(String[] args) {
        CSVAssignment c = new CSVAssignment();
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        //c.listExportersTwoProducts(parser, "fish", "nuts");
        c.bigExporters(parser, "$999,999,999,999");

    }
}
