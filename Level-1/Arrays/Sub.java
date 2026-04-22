import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] ans = new int[a2.length];
        int i = a1.length - 1, j = a2.length - 1, k = ans.length - 1;
        int c = 0;

        while (k >= 0) {
            int sub = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            if (a2[j] + c < a1v) {
                sub = a2[j] + c + 10 - a1v;
                c = -1;
            } else {
                sub = a2[j] + c - a1v;
                c = 0;
            }

            ans[k] = sub;
            i--;
            j--;
            k--;
        }

        // skip leading zeros
        int skip = 0;
        for (int val : ans) {
            if (val == 0)
                skip++;
            else
                break;
        }

        for (; skip < ans.length; skip++) {
            System.out.print(ans[skip] + " ");
        }
    }
}