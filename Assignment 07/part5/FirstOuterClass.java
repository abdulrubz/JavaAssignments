package part5;

public class FirstOuterClass {
    public FirstOuterClass() {
        System.out.println("This is the First Outer Class");
    }

    public static class FirstInnerClass{
        public FirstInnerClass(String string) {
            System.out.println(string);
        }
    }
}
