package OOP.InstanceOfExample;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        //Of course it is true.
        System.out.println(rectangle instanceof Rectangle);

        //True, because every square are rectangle too.
        System.out.println(square instanceof Rectangle);

        //False, because not all rectangles are squares too.
        System.out.println(rectangle instanceof Square);

        //Some cast test
        if (square instanceof Rectangle) {
            Rectangle casttedSquare = (Rectangle) square;
            //And now our sqare is rectangle?!
            System.out.println(casttedSquare instanceof Rectangle);
        }
    }
}
