import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int b = scn.nextInt();
        // int res = decimalAddition(n, m);
        // int res = binaryAddition(n, m);
        int res = anyBaseAddition(n, m, b);
        System.out.println(res);
    }

    public static int decimalAddition(int n, int m) {
        int ans = 0, carry = 0, mult = 1;
        while (n != 0 || m != 0 || carry != 0) {
            int d1 = (n % 10 > 0 ? n % 10 : 0);
            int d2 = (m % 10 > 0 ? m % 10 : 0);
            int sum = d1 + d2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans += sum * mult;
            mult *= 10;
            n = n / 10;
            m = m / 10;
        }

        return ans;
    }

    public static int binaryAddition(int n, int m) {
        int ans = 0, carry = 0, mult = 1;
        while (n != 0 || m != 0 || carry != 0) {
            int d1 = (n % 10 > 0 ? n % 10 : 0);
            int d2 = (m % 10 > 0 ? m % 10 : 0);
            int sum = d1 + d2 + carry;
            carry = sum / 2;
            sum = sum % 2;
            ans += sum * mult;
            mult *= 10;
            n = n / 10;
            m = m / 10;
        }

        return ans;
    }

    public static int anyBaseAddition(int n, int m, int b) {
        int ans = 0, carry = 0, mult = 1;
        while (n != 0 || m != 0 || carry != 0) {
            int d1 = (n % 10 > 0 ? n % 10 : 0);
            int d2 = (m % 10 > 0 ? m % 10 : 0);
            int sum = d1 + d2 + carry;
            carry = sum / b;
            sum = sum % b;
            ans += sum * mult;
            mult *= 10;
            n = n / 10;
            m = m / 10;
        }

        return ans;
    }

}
