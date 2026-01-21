import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0, b = 1;
        while (n-- > 0) {
            int c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
