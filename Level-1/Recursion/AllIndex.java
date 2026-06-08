import java.util.Scanner;

public class AllIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int target = scn.nextInt();
        int[] ans = findAllIndex(arr, 0, target, 0);
        for (int val : ans)
            System.out.println(val);
    }

    public static int[] findAllIndex(int[] arr, int idx, int target, int count) {
        if (idx == arr.length) {
            int[] newArr = new int[count];
            return newArr;
        }

        if (arr[idx] == target) {
            int[] nArr = findAllIndex(arr, idx + 1, target, count + 1);
            nArr[count] = idx;
            return nArr;
        } else {
            int[] nArr = findAllIndex(arr, idx + 1, target, count);
            return nArr;
        }
    }
}
