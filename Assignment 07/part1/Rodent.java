public abstract class Rodent {
    public Rodent() {
        System.out.println("Inside Rodent Class");
    }

    public abstract void displayTeethDetails();

    public String getScientificName() {
        return "Rodentia";
    }
}
