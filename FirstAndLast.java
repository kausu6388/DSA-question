import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        FirstAndLast obj = new FirstAndLast();
        int [] ans = obj.searchRange(arr,target);
        System.out.println(ans[0] + " " + ans[1]);
        // int [] arr = {5,7,7,8,8,10};
        // int target = 8;
        // FirstAndLast obj = new FirstAndLast();
        // int [] ans = obj.searchRange(arr,target);
        // System.out.println(ans[0] + " " + ans[1]);

        
    }
    // //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1 ,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;

        return ans;
        
    }
    int search(int [] nums, int target, boolean findsearch){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(target<nums[mid]){
                end = mid - 1;
            } else if (target>nums[mid]){
                start = mid+1;
            } else {
                ans = mid ;
                if(findsearch){
                    end = mid - 1;
                } else {
                    start  = mid + 1;
                }
            }
        }
        return ans;

    }
    
}


