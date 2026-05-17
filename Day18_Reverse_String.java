//Reverse a string 
import java.util.Scanner;


public class Day18_Reverse_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String sent = sc.nextLine();
        int n = sent.length();
        char[] rev = sent.toCharArray();

        for (int i = 0; i < n / 2; i++) {

            char temp = rev[i];
            rev[i] = rev[n - i - 1];
            rev[n - i - 1] = temp;
        }

        String result = new String(rev);    // converting back to string 
        System.out.println(result);  // both will look same on out put but have difference internally
        System.out.println(rev);

        sc.close();
    }
}


// String reversed = new StringBuilder(sent).reverse().toString();