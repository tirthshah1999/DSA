import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int ans = maxArray(arr, 0);
        System.out.println(ans);
    }

    public static int maxArray(int[] arr, int idx) {
        if (idx == arr.length)
            return Integer.MIN_VALUE;
        int val = maxArray(arr, idx + 1);
        return Math.max(val, arr[idx]);
    }
}
