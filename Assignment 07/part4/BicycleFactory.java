package part4;

public class BicycleFactory {
    public void makeCycles() {
        Bicycle bicycle1 = new Bicycle();
        bicycle1.displayBrand("Avon");
        bicycle1.displayPrice(1200);
        bicycle1.getNoOfWheels();

        Bicycle bicycle2 = new Bicycle();
        bicycle2.displayBrand("Trek");
        bicycle2.displayPrice(1800);
        bicycle2.getNoOfWheels();
    }
}
