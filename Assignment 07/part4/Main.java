package part4;

public class Main {
    public static void main(String[] args) {
        System.out.println("CREATING UNICYCLES");
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        unicycleFactory.makeCycles();

        System.out.println("CREATING BICYCLES");
        BicycleFactory bicycleFactory = new BicycleFactory();
        bicycleFactory.makeCycles();

        System.out.println("CREATING TRICYCLES");
        TricycleFactory tricycleFactory = new TricycleFactory();
        tricycleFactory.makeCycles();

    }
}
