public class secondlarg {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }
        System.out.println("Second largest element is: " + secondlargest);
    }
    
}
