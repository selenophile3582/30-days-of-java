
import java.util.Scanner;

public class Day26_GCD {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers to find their GCD : ");
        int b = sc.nextInt();
        int a = sc.nextInt();
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;

        }
        if (a == 0 && b == 0) {
            System.out.println("The GCD of 0 and 0 is undefined ");
        } else {

            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;

            }
            System.out.println("The GCD is : " + a);
        }

        sc.close();

    }

}
