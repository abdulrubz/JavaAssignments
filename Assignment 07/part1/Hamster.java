public class Hamster extends Rodent {
    public Hamster() {
        System.out.println("Inside Hamster class");
    }

    @Override
    public void displayTeethDetails() {
        System.out.println("I have two front incisor teeth in the upper and lower jaw");
    }

    @Override
    public String getScientificName() {
        return "Cricetinae";
    }
}
