package part3;

public class Main {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.superClassMethod();
        sub.firstClassMethod(sub);
        sub.secondClassMethod(sub);
        sub.thirdClassMethod(sub);
        sub.fourthClassMethod(sub);
    }
}
