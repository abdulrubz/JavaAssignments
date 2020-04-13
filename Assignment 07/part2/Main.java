public class Main {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle[] cycles = new Cycle[3];
        //UPCASTING
        cycles[0] = (Cycle)unicycle;
        cycles[1] = (Cycle)bicycle;
        cycles[2] = (Cycle)tricycle;

        for(Cycle cycle : cycles) {
            /*
            cycle.balance();
            This method will result in error because the Cycle class does not have
            balance() method
             */
        }

        Cycle cycle1 = new Unicycle();
        Cycle cycle2 = new Bicycle();
        Cycle cycle3 = new Tricycle();
        //DOWNCASTING
        Unicycle uni = (Unicycle)cycle1;
        Bicycle bi = (Bicycle)cycle2;
        Tricycle tri = (Tricycle)cycle3;

        uni.balance();
        bi.balance();
        /*
        tri.balance();
        The above method call gives a compile time error as Tricycle does not have a balance() method.
         */
    }
}
