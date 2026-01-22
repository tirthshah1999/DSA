import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int temp = n, nod = 0;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        // handling rotating number given bigger than input
        k = k % nod;

        // handling negative rotating number given
        if (k < 0)
            k = k + nod;

        int div = (int) Math.pow(10, k);
        int mult = (int) Math.pow(10, nod - k);

        int q = n / div;
        int r = n % div;
        int res = r * mult + q;
        System.out.println(res);
    }
}
