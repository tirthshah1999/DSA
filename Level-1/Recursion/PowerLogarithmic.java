
import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(power(x, y));
    }

    public static int power(int x, int y) {
        if (y == 0)
            return 1;
        int pow = power(x, y / 2);
        if (y % 2 == 0)
            return pow * pow;
        else
            return x * pow * pow;
    }
}
