
import java.util.Scanner;

public class Day42_method_to_add_two_num {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = add(a, b);
            System.out.println(result);
        }
    }
}
