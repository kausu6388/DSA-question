public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int target = 4;
        int ans = linearsearch(arr, n, target);
        System.out.println("Element found at index: " + ans);
    }

    public static int linearsearch(int arr[], int n, int target){
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
