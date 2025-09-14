public class ifchecksort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        if (isSorted(arr)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    public static boolean isSorted(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
