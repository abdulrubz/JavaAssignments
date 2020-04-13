public class Gerbil extends Rodent {
    public Gerbil() {
        System.out.println("Inside Gerbil class");
    }

    @Override
    public void displayTeethDetails() {
        System.out.println("I has four incisors and can have 10 or more molars");
    }

    @Override
    public String getScientificName() {
        return "Gerbillinae";
    }
}
