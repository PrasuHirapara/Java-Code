package DSA.SortingAlgorithm;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] arr = {2,21,243,2,21,2,56};

        sorting(arr);

        System.out.println(Arrays.toString(arr));
    }

    // Time complexity O(N*logN)
    // Space Complexity O(log N)
    // Stable

    public static void sorting(int[] nums){
        quick(nums,0,nums.length-1);
    }

    private static void quick(int[] nums, int low, int high) {
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
