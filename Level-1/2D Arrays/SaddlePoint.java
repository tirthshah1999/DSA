import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i][j] < arr[i][low]) {
                    low = j;
                }
            }

            boolean isSp = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][low] > arr[i][low]) {
                    isSp = false;
                    break;
                }
            }

            if (isSp) {
                System.out.println(arr[i][low]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}
