package DSA.SortingAlgorithm;

public class BubbleSort {
    // Time Complexity : O(N*N)
    // Space Complexity : O(1)
    // Stable
    public int[] sorting(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] <= nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
