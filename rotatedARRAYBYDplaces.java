public class rotatedARRAYBYDplaces {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 3;
        rotate(arr,d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void rotate(int[] arr, int d){
        int n = arr.length;
        d = d % n; // In case d is greater than n
        reverse(arr, 0, d - 1); // Reverse first d elements
        reverse(arr, d, n - 1); // Reverse remaining n-d elements
        reverse(arr, 0, n - 1); // Reverse the whole array
    }

    static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}