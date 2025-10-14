public class kTHLargestelement {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        int k = 3;
        int n = arr.length;

        for(int i=0; i<k; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[k-1]);
    }
    
}
