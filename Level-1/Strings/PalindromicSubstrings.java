import java.util.Scanner;

public class PalindromicSubstrings {
    public static boolean isPalindromic(String str) {
        int li = 0, ri = str.length() - 1;
        while (li <= ri) {
            char c1 = str.charAt(li);
            char c2 = str.charAt(ri);
            if (c1 != c2)
                return false;
            else {
                li++;
                ri--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (isPalindromic(ss)) {
                    System.out.println(ss);
                }
            }
        }
    }
}
