package part3;

public class ArrayOfObjects {
    public ArrayOfObjects (String string) {
        System.out.println("Inside the constructor : Object "+string);
    }

    public static void main(String[] args) {
        ArrayOfObjects[] array = new ArrayOfObjects[5];
        for (int i=0; i<=array.length-1; i++) {
            System.out.println(array[i]);
            // Returns null values
        }
    }
}
