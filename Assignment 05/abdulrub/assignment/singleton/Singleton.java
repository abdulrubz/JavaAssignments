package abdulrub.assignment.singleton;

public class Singleton {
    String str;

    public static Singleton initializeVar(String input) {
        /*
        str = input;
        The above line will result in a compile time error as we are making a static reference to a
        non-static field i.e. str.

        Non-static members can be called only from instances of that class.
         */
        Singleton obj = new Singleton();
        return obj;
    }

    public void printString() {
        System.out.println(str);
    }
}
