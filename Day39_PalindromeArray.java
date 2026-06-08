// Check if array is palindrome 

import java.util.Scanner;

public class Day39_PalindromeArray {

    public static boolean checkPalindrome(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = checkPalindrome(arr);
        
        System.out.println(result ? "Palindrome" : "Not a Palindrome");

        sc.close();
    }

}
