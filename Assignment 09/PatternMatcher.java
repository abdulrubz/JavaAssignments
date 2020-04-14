import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatcher {

    public void testIsMatch() {
        String regex = "^[A-Z].*[.]$";
        System.out.println("Enter text");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if(Pattern.matches(regex, input)) {
            System.out.println("String starts with Capital and ends with a period");
        } else {
            System.out.println("String does not match the regular expression");
        }
    }
}
