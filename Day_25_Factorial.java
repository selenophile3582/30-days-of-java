// Day 25 : Take a number from user and find its factorial by iterative method 

import java.math.BigInteger;
import java.util.Scanner;

public class Day_25_Factorial {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));

        }
        System.out.println("Factorial : " + fact);

        int digits = fact.toString().length();
        System.out.println("The no of digits in this factorial is " + digits);
        sc.close();
    }
}

// documentation 

// BigInteger is a class not a primitive data dype so we cannot use 
// +,-,*,/ directly so we use methods like .add(), .subtract(), . multiply(), .divide()

