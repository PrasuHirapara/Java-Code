package DSA.SortingAlgorithm;

public class SelectionSort {
    // Time Complexity : O(N*N)
    // Space Complexity : O(1)
    // Not Stable Algo

    public int[] sorting(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int max_index = 0;
            int end = nums.length - 1 - i;

            // Finding max value;
            for (int j = 0; j <= end; j++) {
                if (nums[j] > nums[max_index]) {
                    max_index = j;
                }
            }
            swap(nums, max_index, end);
        }

        return nums;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
