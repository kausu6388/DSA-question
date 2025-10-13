public class productofarrayEXcludingONE {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int prod[] = new int[n];

        left[0] = 1;
        right[n-1] = 1;

        for(int i=1; i<n; i++){
            left[i] = arr[i-1] * left[i-1];
        }

        for(int j=n-2; j>=0; j--){
            right[j] = arr[j+1] * right[j+1];
        }

        for(int k=0; k<n; k++){
            prod[k] = left[k] * right[k];
        }

        for(int i=0; i<n; i++){
            System.out.print(prod[i] + " ");
        }
    }
    
    
}
