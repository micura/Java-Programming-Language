package DataTypes;

import java.util.Date;

public class ValuePassExample {
    void calculateWithPrimitive(){
        int number = 5;
        //Pass by value
        change(number);
        System.out.println(number);
    }

    void calculateWithNonPrimitive(){
        Date date = new Date();
        System.out.println("Before: " + date.getTime());
        change(date);
        System.out.println("After: " + date.getTime());
    }

    void change(int num) {
        num = 10;
    }
    void change(Date d) {
        d.setTime(20);
    }

    public static void main(String[] args) {
        ValuePassExample test = new ValuePassExample();
        test.calculateWithPrimitive();
        test.calculateWithNonPrimitive();
    }
}
