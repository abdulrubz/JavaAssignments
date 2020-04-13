public class Mouse extends Rodent {
    public Mouse() {
        System.out.println("Inside Mouse Class");
    }

    @Override
    public void displayTeethDetails() {
        System.out.println("I have 12 molars & 4 incisors.");
    }

    @Override
    public String getScientificName() {
        return "Mus musculus";
    }
}
