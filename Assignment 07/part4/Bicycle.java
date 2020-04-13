package part4;

public class Bicycle implements Cycle {
    public Bicycle() {
        System.out.println("This is Bicycle class");
    }
    @Override
    public void displayBrand(String brand) {
        System.out.println("This is a "+brand+" Bicycle");
    }

    @Override
    public void displayPrice(int price) {
        System.out.println("This Unicycle is priced at Rs. "+price);
    }

    @Override
    public void getNoOfWheels() {
        System.out.println("A Bicycle has two wheels");
    }
}
