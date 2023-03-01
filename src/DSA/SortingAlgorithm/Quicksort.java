package DSA.SortingAlgorithm;

public class Quicksort {
    // Space Complexity O(N*N)
    // Stable

    public int[] sorting(int[] nums){
        quick(nums,0,nums.length-1);

        return nums;
    }

    private void quick(int[] nums, int low, int high) {
        if(low >= high){
            return;
        }
        int s = low,e = high, m = s+(e-s)/2;
        int pivot = nums[m];

        while(s <= e){
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        quick(nums,low,e);
        quick(nums,s,high);
    }
}
