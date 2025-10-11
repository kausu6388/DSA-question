public class moveallzeros {

    public static void main(String[] args) {
        int  arr [] = {9,0,0,8,2,0,6,0,4};
        int n = arr.length;
        moveAllZeros(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    static void moveAllZeros(int[] arr, int n) {
        int count = 0; // Count of non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // here count is incremented
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }
    }
}
// home work
// rain water tappin.
// leetcode one.
// https://leetcode.com/problems/trapping-rain-water/description/
// https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
