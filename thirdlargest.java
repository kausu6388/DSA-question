public class thirdlargest {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 5, 0, 3};
        int n = arr.length;
        System.out.println(thirdLargest(arr, n));
    }

    static int thirdLargest(int[] arr, int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }

        return (third == Integer.MIN_VALUE) ? -1 : third;
    }
}
