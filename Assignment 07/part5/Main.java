package part5;

public class Main {
    public static void main(String[] args) {
        SecondOuterClass secondOuter = new SecondOuterClass();
        SecondOuterClass.SecondInnerClass secondInner = new SecondOuterClass.SecondInnerClass("Hello world");
    }
}
