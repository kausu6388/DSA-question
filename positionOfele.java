public class positionOfele {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand range until target is <= arr[end]
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            // double the range size
            end = end + (end - start + 1) * 2;
            if (end >= arr.length) {
                end = arr.length - 1; // keep within bounds
            }
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // not found
    }
}
