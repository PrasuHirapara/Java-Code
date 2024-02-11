package DSA.SortingAlgorithm;

public class InsertionSort {
    // Time Complexity : O(N*N)
    // Space complexity : (1)
    // Stable algorithm.

    public int[] sorting(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return nums;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
