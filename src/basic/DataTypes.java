package basic;

/**
 * This class include:
 * - Java data types
 * - Example for inner, outer and anonymus classes
 */

interface SaySomething {
    String hello();
}

//Outer class
class OuterClass {
    private String innerVariable = "This is a private inner variable!";

    //First inner class
    private class PrimitiveTypes {
        public void printPrimitives() {
            boolean booleanVariable = false;
            System.out.println("This is a boolean type: " + booleanVariable);

            char characterVariable = 'a';
            System.out.println("This is a character type: " + characterVariable);

            byte firstByteVariable = 'a';
            byte secondByteVariable = 127;
            System.out.println("This is a byte type: " + firstByteVariable);
            System.out.println("This is a byte type: " + secondByteVariable);

            short shortVariable = 32767;
            System.out.println("This is a short type: " + shortVariable);

            int intVariable = -42;
            System.out.println("This is an int type: " + intVariable);

            long longVariable = 0;
            System.out.println("This is a long type: " + longVariable);

            float floatVariable = 3.14f;
            System.out.println("This is a float type: " + floatVariable);

            double doubleVariable = -232.000130001;
            System.out.println("This is a double type: " + doubleVariable);
        }
    }

    //Second inner class
    private class NonPrimitiveTypes {
        public void printInnerVariable() {
            System.out.println("\nWe reach the internal variable from Inner class--> " + innerVariable + "\n");
        }

        public void printNonPrimitives() {
            String firstString = "String Constant Pool";
            String secondString = new String("Heap String");
            System.out.println("This is a String type: " + firstString);
            System.out.println("This is a String type: " + secondString);

            Integer integerVariable = 128;
            System.out.println("This is an Integer type: " + integerVariable);
        }
    }

    void getPrimitives() {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        primitiveTypes.printPrimitives();

        NonPrimitiveTypes nonPrimitiveTypes = new NonPrimitiveTypes();
        nonPrimitiveTypes.printInnerVariable();
        nonPrimitiveTypes.printNonPrimitives();
    }
}

public class DataTypes {
    public void displayHello(SaySomething say) {
        System.out.println(say.hello() + "Anonymus inner class example!");
    }

    public static void main(String[] args) {
        //We can't create an instance from an internal class
        //--> PrimitiveTypes testPrimitives = new PrimitiveTypes();

        //But we can get from methods
        OuterClass testTypes = new OuterClass();
        testTypes.getPrimitives();

        //Anonymus class example
        DataTypes myClass = new DataTypes();
        myClass.displayHello(new SaySomething() {
            public String hello() {
                return "Hello ";
            }
        });
    }
}
