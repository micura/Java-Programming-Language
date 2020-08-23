package polimorfismExample;

public class Main {
    public static void main(String[] args) throws Exception {
        //Method Overriding
        Dog dog = new Dog();
        dog.sayHello();
        Cat cat = new Cat();
        cat.sayHello();

        //Overloading  --> Same method diffrent parameters.
        dog.printNumbers(1);
        dog.printNumbers(1,2);
        dog.printNumbers(1, 2, 3);
    }
}
