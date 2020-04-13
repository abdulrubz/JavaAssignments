package part4;

public class Tricycle implements Cycle {
    public Tricycle() {
        System.out.println("This is Tricyle Class");
    }

    @Override
    public void displayBrand(String brand) {
        System.out.println("This is a "+brand+" Tricycle");
    }

    @Override
    public void displayPrice(int price) {
        System.out.println("This Tricycle is priced at Rs. "+price);
    }

    @Override
    public void getNoOfWheels() {
        System.out.println("A Tricycle has three wheels");
    }
}
