import java.util.Scanner;

public class ExitPoint {
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

        int r = 0, c = 0, dir = 0;
        while (true) {
            dir = (dir + arr[r][c]) % 4;
            if (dir == 0) {
                c++;
            } else if (dir == 1) {
                r++;
            } else if (dir == 2) {
                c--;
            } else if (dir == 3) {
                r--;
            }

            if (c < 0) {
                c++;
                break;
            } else if (r < 0) {
                r++;
                break;
            } else if (c == arr[0].length) {
                c--;
                break;
            } else if (r == arr.length) {
                r--;
                break;
            }
        }

        System.out.println(r);
        System.out.println(c);
    }
}
