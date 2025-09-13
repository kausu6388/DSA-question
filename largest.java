public class largest {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int largest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element is: " + largest);
    }
}