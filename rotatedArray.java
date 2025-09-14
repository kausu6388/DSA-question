public class rotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            }

            // Determine which side is sorted
            if (nums[start] <= nums[mid]) { // Left side is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // Target is in the left sorted side
                } else {
                    start = mid + 1; // Target is in the right side
                }
            } else { // Right side is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // Target is in the right sorted side
                } else {
                    end = mid - 1; // Target is in the left side
                }
            }
        }

        return -1; // Target not found
    }
    
}
