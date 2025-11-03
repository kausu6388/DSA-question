public class SplitArrayTargetsum {
    public boolean canSplit(int[] nums, int target) {
        int leftSum = 0;
        int rightSum = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (leftSum <= rightSum) {
                leftSum += nums[left];
                left++;
            } else {
                rightSum += nums[right];
                right--;
            }
        }

        return leftSum == target || rightSum == target;
    }
    public static void main(String[] args) {
        SplitArrayTargetsum splitter = new SplitArrayTargetsum();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        boolean result = splitter.canSplit(nums, target);
        System.out.println("Can split to target sum " + target + ": " + result);
    }
    
}
