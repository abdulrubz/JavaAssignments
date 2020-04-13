package part3;

public class SubClass extends SuperClass implements inheritingInterface {
    @Override
    public void firstMethod() {
        System.out.println("This is the first method");
    }

    @Override
    public void secondMethod() {
        System.out.println("This is the second method");
    }

    @Override
    public void thirdMethod() {
        System.out.println("This is the third method");
    }

    @Override
    public void fourthMethod() {
        System.out.println("This is the fourth method");
    }

    @Override
    public void fifthMethod() {
        System.out.println("This is the fifth method");
    }

    @Override
    public void sixthMethod() {
        System.out.println("This is the sixth method");
    }

    @Override
    public void seventhMethod() {
        System.out.println("This is the seventh method");
    }

    public void firstClassMethod(firstInterface i) {
        System.out.println("This is the first method of SubClass");
        i.firstMethod();
        i.secondMethod();
    }

    public void secondClassMethod(secondInterface i) {
        System.out.println("This is the second method of SubClass");
        i.thirdMethod();
        i.fourthMethod();
    }

    public void thirdClassMethod(thirdInterface i) {
        System.out.println("This is the third method of SubClass");
        i.fifthMethod();
        i.sixthMethod();
    }

    public void fourthClassMethod(inheritingInterface i) {
        System.out.println("This is the fourth method of SubClass");
        i.firstMethod();
        i.secondMethod();
        i.thirdMethod();
        i.fourthMethod();
        i.fifthMethod();
        i.sixthMethod();
        i.seventhMethod();
    }
}
