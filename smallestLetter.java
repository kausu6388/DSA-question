public class smallestLetter {
    public static void main(String[] args) {
        char [] arr = {'c','f','j'};
        char target = 'j';
        char ans = smallestLetter(arr,target);
        System.out.println(ans);
        
    }
    // return the index of smallest number >= target
    static char smallestLetter(char [] arr, char target){
        int start = 0;
        int end  = arr.length - 1;
        while (start<=end) {
            // find the middle element
            int mid  = start +(end - start)/2;
            if (target<arr[mid]){ 
            end = mid - 1;
            
                
            } else {
                start = mid + 1;

            } 
            

            
        }
        return arr[start % arr.length];
    }
    
}
