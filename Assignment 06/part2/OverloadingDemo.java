package part2;

public class OverloadingDemo {
    private int x, y;

    public OverloadingDemo(int x) {
        this(x, 3);
    }
    public OverloadingDemo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        OverloadingDemo demo1 = new OverloadingDemo(2);
        System.out.println("Demo1's x value: "+demo1.x);
        System.out.println("Demo1's y value: "+demo1.y);

        OverloadingDemo demo2 = new OverloadingDemo(12, 13);
        System.out.println("Demo2's x value: "+demo2.x);
        System.out.println("Demo2's y value: "+demo2.y);
    }

}
