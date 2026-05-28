import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String res1 = compression1(str);
        String res2 = compression2(str);
        System.out.println(res1);
        System.out.println(res2);
    }

    public static String compression1(String str) {
        String s = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);
            if (curr != prev) {
                s += curr;
            }
        }
        return s;
    }

    public static String compression2(String str) {
        String s = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                if (count != 1) {
                    s += count;
                    count = 1;
                }
                s += curr;
            }
        }

        if (count > 1)
            s += count;
        return s;
    }
}