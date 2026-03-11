import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        // int res = binaryToDecimal(n);
        // int res = binaryToDecimal(n);
        // int res = decimalToAnyBase(n, b);
        // int res = anyBaseToDecimal(n, b);
        int res = anyBaseToAnyBase(n, b1, b2);
        System.out.println(res);
    }

    public static int decimalToBinary(int n) {
        int mult = 1, res = 0;

        while (n != 0) {
            int q = n / 2;
            int r = n % 2;
            res += r * mult;
            mult *= 10;
            n = q;
        }

        return res;
    }

    public static int binaryToDecimal(int n) {
        int mult = 1, res = 0;

        while (n != 0) {
            int q = n / 10;
            int r = n % 10;
            res += r * mult;
            mult *= 2;
            n = q;
        }

        return res;
    }

    public static int decimalToAnyBase(int n, int b) {
        int res = 0, mult = 1;
        while (n != 0) {
            int q = n / b;
            int r = n % b;
            res += r * mult;
            mult *= 10;
            n = q;
        }

        return res;
    }

    public static int anyBaseToDecimal(int n, int b) {
        int res = 0, mult = 1;
        while (n != 0) {
            int q = n / 10;
            int r = n % 10;
            res += r * mult;
            mult *= b;
            n = q;
        }

        return res;
    }

    // Due to constraints our operators(+,-,*,/,%) works on decimal numbers only
    // thats why we have to convert into decimal than to any base.
    public static int anyBaseToAnyBase(int n, int b1, int b2) {
        int decimal = anyBaseToDecimal(n, b1);
        int ans = decimalToAnyBase(decimal, b2);
        return ans;
    }

}
