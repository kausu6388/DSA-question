public class midianOFTWOsortedarry {
    public static void main(String[] args) {
        int arr1[] = {1,3};
        int arr2[] = {2};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int merged[] = new int[n1+n2];
        int i=0, j=0, k=0;

        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                merged[k] = arr1[i];
                i++;
            }else{
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while(j<n2){
            merged[k] = arr2[j];
            j++;
            k++;
        }

        int mid = (n1+n2)/2;
        if((n1+n2)%2 == 0){
            double median = (merged[mid] + merged[mid-1])/2.0;
            System.out.println(median);
        }else{
            System.out.println(merged[mid]);
        }
    }
    
}
