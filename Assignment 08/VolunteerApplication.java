import java.util.Scanner;

public class VolunteerApplication {
    public void testApplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name to enroll as a Volunteer");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        try {
            if(name.length() < 3) {
                throw new IllegalNameException("Name must have minimum 2 characters");
            }
            else if(age < 16) {
                throw new LowAgeException("You must be at least 16 to volunteer");
            } else if(age > 60) {
                throw new HighAgeException("You are too old to volunteer. Oops");
            } else {
                System.out.println("Dear "+name+", thank you for enrolling");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is the finally block. ");
        }
    }
}
