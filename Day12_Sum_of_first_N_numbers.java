// Printing sum of first N natural numbers with loop 

import java.util.Scanner;

public class Day12_Sum_of_first_N_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");

        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.printf("The Sum of First "+n+" natural numbers is "+result);
        sc.close();
    }

}
