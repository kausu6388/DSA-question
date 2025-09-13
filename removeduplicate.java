class removeduplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4,5,6};
        int n = arr.length;
        int k = 1;
        for(int i=0; i<n; i++){
            if(arr[i] != arr[k-1]){
                arr[k] = arr[i];
                k++;
            }

        }
        // System.out.println("Number of unique elements: " + k);e
        System.out.print("Array after removing duplicates: ");
        for(int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // public int removeDuplicates(int[] nums) {
    //     if (nums.length == 0) return 0;
    //     int k = 1;
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] != nums[k - 1]) {
    //             nums[k] = nums[i];
    //             k++;
    //         }
    //     }
    //     return k;
    // }

    // public static void main(String[] args) {
    //     removeduplicate obj = new removeduplicate();

    //     int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 6};
    //     int k = obj.removeDuplicates(arr);

    //     System.out.println("Number of unique elements: " + k);
    //     System.out.print("Array after removing duplicates: ");
    //     for (int i = 0; i < k; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }
}
