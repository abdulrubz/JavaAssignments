package part4;

public class TricycleFactory {
    public void makeCycles() {
        Tricycle tricycle1 = new Tricycle();
        tricycle1.displayBrand("Hercules");
        tricycle1.displayPrice(2400);
        tricycle1.getNoOfWheels();

        Tricycle tricycle2 = new Tricycle();
        tricycle2.displayBrand("Avon");
        tricycle2.displayPrice(2800);
        tricycle2.getNoOfWheels();
    }
}
