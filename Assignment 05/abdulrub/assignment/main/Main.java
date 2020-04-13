package abdulrub.assignment.main;

import abdulrub.assignment.data.Data;
import abdulrub.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.printInstanceVariables();
//      d.printLocalVariables();

        Singleton s;
//      s = Singleton.initializeVar("Hello, world!"); //Static ref to non-static field in that method
//      s.printString(); //Above initialize results in error. So, this object remains un-initialized.
    }
}
