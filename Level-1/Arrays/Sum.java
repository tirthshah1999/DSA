import java.util.Scanner;

public class Sum {
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

        int[] ans = new int[a1.length > a2.length ? a1.length : a2.length];
        int i = a1.length - 1, j = a2.length - 1, k = ans.length - 1;
        int c = 0;

        while (k >= 0) {
            int sum = (i >= 0 ? a1[i] : 0) + (j >= 0 ? a2[j] : 0) + c;
            ans[k] = sum % 10;
            c = sum / 10;
            i--;
            j--;
            k--;
        }

        if (c > 0)
            System.out.print(c + " ");

        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}