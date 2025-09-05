public class rotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            }

            // Determine which side is sorted
            if (nums[left] <= nums[mid]) { // Left side is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Target is in the left sorted side
                } else {
                    left = mid + 1; // Target is in the right side
                }
            } else { // Right side is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Target is in the right sorted side
                } else {
                    right = mid - 1; // Target is in the left side
                }
            }
        }

        return -1; // Target not found
    }
    
}
