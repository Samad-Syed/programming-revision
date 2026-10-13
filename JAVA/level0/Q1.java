
// import java.lang.*;
import java.util.Scanner;

public class Q1 {
    final int NAME_LENGTH = 32;

    public static void main(String argv[]) {
        System.out.print(" Enter the Name :");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Hello " + name);
        sc.close();

    }
}
