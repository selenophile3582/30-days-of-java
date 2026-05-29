// Check if a number is palindrome

import java.util.Scanner;

public class Day29_Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;

        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome !!");
        } else {
            System.out.println("Not a Palindrome ");
        }
        sc.close();
    }
}
