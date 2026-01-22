import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int div = 2; div * div <= n; div++) {
            while (n % div == 0) {
                n = n / div;
                System.out.print(div + " ");
            }
        }
        // in case like n = 46
        if (n != 1)
            System.out.println(n);
    }
}
