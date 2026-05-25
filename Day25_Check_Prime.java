
import java.util.Scanner;

public class Day25_Check_Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int is_prime = 1;

        if (n < 2) {
            System.out.println("Not Prime .");
        } else {

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    is_prime = 0;
                    break;

                }

            }

            if (is_prime == 1) {
                System.out.println("Prime number ");
            } else {
                System.out.println("Not a Prime number ");
            }
        }
        sc.close();

    }
}
