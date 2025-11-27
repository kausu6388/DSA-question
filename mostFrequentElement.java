public class mostFrequentElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,2,5,1,3,1,1};
        int n = arr.length;
        int maxCount = 0;
        int mostFrequent = arr[0];

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                mostFrequent = arr[i];
            }
        }
        System.out.println("Most frequent element is: " + mostFrequent + " with frequency: " + maxCount);
    }
    
}
