public class moveallzeros {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int n = arr.length;
        moveZeroes(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void moveZeroes(int[] arr, int n) {
        int count = 0; // Count of non-zero elements

        // Traverse the array. If element
        // encountered is non-zero, then
        // replace the element at index
        // 'count' with this element
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // here count is
                                        // incremented
            }
        }

        // Now all non-zero elements have been
        // shifted to front and 'count' is set
        // as index of first 0. Make all
        // elements 0 from count to end.
        while (count < n) {
            arr[count++] = 0;
        }
    }
    
}
