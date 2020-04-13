package part4;

public class Unicycle implements Cycle {
    public Unicycle() {
        System.out.println("This is Unicycle class");
    }

    @Override
    public void displayBrand(String brand) {
        System.out.println("This is a "+brand+" Unicycle");
    }

    @Override
    public void displayPrice(int price) {
        System.out.println("This Unicycle is priced at Rs. "+price);
    }

    @Override
    public void getNoOfWheels() {
        System.out.println("A Unicycle has only one wheel");
    }
}
