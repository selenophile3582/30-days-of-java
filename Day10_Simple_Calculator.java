// Simple Calculator 

import java.util.Scanner;

public class Day10_Simple_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number :");
        int b = sc.nextInt();

        System.out.print("Enter the operation that you want to perform ( +,-,*,/,%):");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.printf("The sum is : %d ", a + b);
                break;
            case "-":
                System.out.printf("The difference is : %d ", a - b);
                break;
            case "*":
                System.out.printf("The Product is : %d ", a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Division by 0 is not allowed ");
                    break;
                }
                System.out.printf("The Quotient is : %d ", a / b);
                break;
            case "%":
                System.out.printf("The Remainder is : %d", a % b);
                break;
            default:
                System.out.println("Please enter a valid operator ! ");
        }
        sc.close();
    }

}
