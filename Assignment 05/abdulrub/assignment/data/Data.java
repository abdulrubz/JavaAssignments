package abdulrub.assignment.data;

public class Data {
    int variable1;
    char variable2;

    public void printInstanceVariables() {
        System.out.println("Variable 1: "+variable1+", Variable 2: "+variable2);
    }

    /*
    public void printLocalVariables() {
        int localVar1;
        char localVar2;
        System.out.println("Local Variable 1: "+localVar1+", Local Variable 2: "+localVar2);
    }

    The above method 'printLocalVariables()' results in a compile time error as the local variables are not
    initialized by the user. Local variables are used to compute something in a function and have to be
    initialized by the programmer. Therefore, they programmed to not take any default values.

    To remove this compile time error, we can initialize localVariable1 & localVariable2 to some value.

    */


}
