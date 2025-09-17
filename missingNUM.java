public class missingNUM {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 5};
        int n = arr.length;
        System.out.println("The missing number is: " + missingNumber(arr, n));
    }

    static int missingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2; 
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i]; 
        }
        return total - sum; 
    }
    
}
