package part4;

public class ManyObjects {
    public ManyObjects(String string) {
        System.out.println("Inside the constructor : Object "+string);
    }

    public static void main(String[] args) {
        ManyObjects[] array = new ManyObjects[5];
        for (int i=0; i<=array.length-1; i++) {
            array[i] = new ManyObjects("Number "+ (i+1));
        }
    }
}
