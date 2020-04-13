package part4;

public class UnicycleFactory {
    public void makeCycles() {
        Unicycle unicycle1 = new Unicycle();
        unicycle1.displayBrand("Hercules");
        unicycle1.displayPrice(500);
        unicycle1.getNoOfWheels();

        Unicycle unicycle2 = new Unicycle();
        unicycle1.displayBrand("Hero");
        unicycle2.displayPrice(550);
        unicycle2.getNoOfWheels();
    }

}
