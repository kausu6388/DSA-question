// public class sortARRAY {

//     public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 3};
//         bubbleSort(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
            
//         }
//         // for (int num : arr) {
//         //     System.out.print(num + " ");
//         // }
//     }

//     public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         boolean swapped;
//         for (int i = 0; i < n - 1; i++) {
//             swapped = false;
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // Swap arr[j] and arr[j+1]
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swapped = true;
//                 }
//             }
    
//             if (!swapped) break;
//         }
//     }
// }


import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
     
    }
}