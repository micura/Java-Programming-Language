import java.util.Scanner;

public class StandardInputOutput {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        scan.close();

        System.out.println(a);

        //TODO other example...
    }
}
