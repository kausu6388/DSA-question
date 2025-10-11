public class CeilingNUM {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceilingNum(arr,target);
        System.out.println(ans);
        
    }
    // return the index of smallest number >= target
    static int ceilingNum(int [] arr, int target){
        int start = 0;
        int end  = arr.length - 1;
        while (start<=end) {
            // find the middle element
            int mid  = start +(end - start)/2;
            if (target<arr[mid]){ 
            end = mid - 1;
            
                
            } else if (target >arr[mid]){
                start = mid + 1;

            } else{
                return mid;
            }
            

            
        }
        return start;
    }

    
}
