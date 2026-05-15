// Count vowels in a string 

import java.util.Scanner;

public class Day17_Vowels_Counting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] vowArray = {'a', 'e', 'i', 'o', 'u'};

        System.out.print("Enter your string :");
        String sen = sc.nextLine().toLowerCase();
        int count = 0;
        for (char c : sen.toCharArray()) {

            for (char v : vowArray) {
                if (v == c) {
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}


/*  Better version 
for (char c : sen.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
 */


/*more improved than if(......) 
        for (char c : sen.toCharArray()) {
    if ("aeiou".indexOf(c) != -1) {
        count++;
    }
}
    */
