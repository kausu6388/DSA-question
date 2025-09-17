public class MaxConsecutiveOne {
	public static void main(String[] args) {
		int arr[] = {1,1,0,1,1,1};
		int n = arr.length;
		int result = findMaxConsecutiveOnes(arr);
		System.out.println(result);
	}
	static int findMaxConsecutiveOnes(int[] arr) {
		int maxCount = 0; // Initialize result
		int count = 0; // Initialize count of 1's

		for (int i = 0; i < arr.length; i++) {
			// Reset count when 0 is found
			if (arr[i] == 0) {
				count = 0;
			} else { // Increment count of 1's
				count++;
				maxCount = Math.max(maxCount, count);
			}
		}
		return maxCount;
	}
	
}