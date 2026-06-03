
import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(power(x, y));
    }

    public static int power(int x, int y) {
        if (y == 0)
            return 1;
        return x * power(x, y - 1);
    }
}
