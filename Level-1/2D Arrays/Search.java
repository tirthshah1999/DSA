import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int data = scn.nextInt();

        int i = 0, j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == data) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (arr[i][j] > data) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("Not found");
    }
}
