import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        String[] signUpDate = new String[n];
        String[] currentDate = new String[n];

        System.out.println("Enter the dates");
        int j = 0, k = 0;
        for (int i=0; i<n*2; i++) {
            if(i%2 == 0) {
                signUpDate[j] = scanner.next();
                j++;
            } else {
                currentDate[k] = scanner.next();
                k++;
            }
        }

        GruberKYC gruberKYC = new GruberKYC();
        String[] range = new String[n];
        for (int i=0; i<n; i++) {
            range[i] = gruberKYC.parseDatesAndFindRange(signUpDate[i], currentDate[i]);
        }

        for (int i=0; i<n; i++) {
            System.out.println(range[i]);
        }

    }
}
