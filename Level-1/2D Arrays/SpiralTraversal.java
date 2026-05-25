import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0, minc = 0, maxr = arr.length - 1, maxc = arr[0].length - 1;
        int tne = n * m, cnt = 0;
        while (cnt < tne) {
            // lw
            for (int i = minr, j = minc; i <= maxr && cnt < tne; i++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;

            // bw
            for (int i = maxr, j = minc; j <= maxc && cnt < tne; j++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;

            // rw
            for (int i = maxr, j = maxc; i >= minr && cnt < tne; i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;

            // tw
            for (int i = minr, j = maxc; j >= minc && cnt < tne; j--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }
}
