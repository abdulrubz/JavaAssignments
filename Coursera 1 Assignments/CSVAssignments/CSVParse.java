import edu.duke.*;
import org.apache.commons.csv.*;

public class CSVParse {
    public void readPlace() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        for(CSVRecord record : parser) {
            System.out.print(record.get("Name") + " ");
            System.out.println(record.get("Place"));
        }
    }

    public static void main(String[] args) {
        CSVParse c = new CSVParse();
        c.readPlace();
    }
}