public class majorityElement {
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,3,3,3,3,3,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
        
    }
    static int majorityElement(int [] arr){
        int count = 0;
        int candidate = -1;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
    
}
