import java.util.Scanner;

public class DisplayArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int idx) {
        if (idx == arr.length)
            return;

        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }
}
