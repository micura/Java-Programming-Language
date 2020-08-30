package Stuffs;

public class Stuffs {
    private static Object obj = new Object();

    public static void main(String[] args) {
        boolean isInstance = obj instanceof Object;
        System.out.println(isInstance);
    }
}
