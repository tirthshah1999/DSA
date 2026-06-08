import java.util.Scanner;

public class FiAndLi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int target = scn.nextInt();
        int fi = firstIndex(arr, 0, target);
        int li = lastIndex(arr, arr.length - 1, target);
        System.out.println(fi);
        System.out.println(li);
    }

    public static int firstIndex(int[] arr, int idx, int target) {
        if (idx == arr.length)
            return -1;

        if (arr[idx] == target)
            return idx;
        else
            return firstIndex(arr, idx + 1, target);
    }

    public static int lastIndex(int[] arr, int idx, int target) {
        if (idx < 0)
            return -1;

        if (arr[idx] == target)
            return idx;
        else
            return lastIndex(arr, idx - 1, target);
    }
}
