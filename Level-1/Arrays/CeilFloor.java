public class CeilFloor {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int data = 77;
        int lo = 0, hi = arr.length - 1, ceil = 0, floor = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid];
            } else if (data < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }
}
