public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Hamster();
        rodents[2] = new Gerbil();

        for (Rodent rodent : rodents) {
            System.out.println("I am " + rodent.getClass());
            System.out.println("My scientific name is " + rodent.getScientificName());
            rodent.displayTeethDetails();
        }

    }
}
