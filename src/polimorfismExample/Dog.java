package polimorfismExample;

public class Dog extends Animal {
    @Override
    public void sayHello() {
        System.out.println("Hello Dog");
    }

    public void printNumbers(int numberOne) {
        System.out.println("Numbers " + numberOne);
    }

    public void printNumbers(int numberOne, int numberTwo) {
        System.out.println("Numbers " + numberOne + " " + numberTwo);
    }

    public void printNumbers(int numberOne, int numberTwo, int numberThree) {
        System.out.println("Numbers " + numberOne + ", " + numberTwo + ", " + numberThree);
    }
}
