public class FirstLastIndex {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 20, 20, 60, 70, 80, 90, 100 };
        int data = 20;
        int lo = 0, hi = arr.length - 1, fi = -1, li = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
            } else if (data < arr[mid]) {
                hi = mid - 1;
            } else {
                fi = mid;
                hi = mid - 1;
            }
        }

        lo = 0;
        hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
            } else if (data < arr[mid]) {
                hi = mid - 1;
            } else {
                li = mid;
                lo = mid + 1;
            }
        }

        System.out.println(fi);
        System.out.println(li);
    }
}
