//20. Take array input and print all elements  

import java.util.Scanner;

public class Day20_Array_Printing {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of your array : ");
        int size = sc.nextInt();

        //creating array of the user choice length 
        int my_arr[] = new int[size];
        System.out.print("Enter your elements : ");

        // Taking elements of the array from the user 
        for (int i = 0; i < my_arr.length; i++) {
            my_arr[i] = sc.nextInt();
        }
        System.out.print("Your elements are as : ");
        //printing the numbers of the array 
        for (int i = 0; i < my_arr.length; i++) {
            System.out.print(my_arr[i]+" ");
        }
        // System.out.println(my_arr);  this will now print the elements rather it will print [I@7d4991ad like this something

        sc.close();

    }
}
