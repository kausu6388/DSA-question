public class longest_subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;
        int n = arr.length;

        int maxLength = findLongestSubarrayWithSumK(arr, n, k);
        System.out.println("Length of the longest subarray with sum " + k + " is: " + maxLength);
    }

    public static int findLongestSubarrayWithSumK(int[] arr, int n, int k) {
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
    
}
