package DSA.SortingAlgorithm;

public class CyclicSort {
    // Time Complexity : O(N)
    // Space Complexity : O(1)
    // When given array contains [1,N] element.

    public int[] sorting(int[] nums) {
        int i = 0;

        while(i<nums.length){
            int corr_ind = nums[i]-1;
            if(nums[i] != nums[corr_ind]){
                swap(nums,i,corr_ind);
            }else{
                i++;
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
