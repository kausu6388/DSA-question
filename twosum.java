// public class twosum {
//     public static void main(String[] args) {
//         int arr[] = {2,7,11,15};
//         int target = 9;
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(arr[i] + arr[j] == target){
//                     System.out.println("Indices are: " + i + " and " + j);
//                 }
//             }
//         }
//     }
    
// }

import java.util.Scanner;

public class twosum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] result = new int[2];
        int target = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    result[0] = i;
                    result[1] = j;
                   
                   
                }
            }
            return ;
        }

    }
}