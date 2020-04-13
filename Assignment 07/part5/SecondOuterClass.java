package part5;

public class SecondOuterClass {
    public SecondOuterClass() {
        System.out.println("This is the Second Outer Class");
    }
    public static class SecondInnerClass extends FirstOuterClass.FirstInnerClass {
        SecondInnerClass(String string) {
            super(string);
        }
    }
}
