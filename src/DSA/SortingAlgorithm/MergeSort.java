package DSA.SortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
    // Time Complexity O(N + NlogN)
    // Not Stable
    public int[] sorting(int[] nums){
        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length/2;

        int[] left = sorting(Arrays.copyOfRange(nums,0,mid));
        int[] right = sorting(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+ second.length];

        int i=0,j=0,k=0;
        while(i< first.length && j< second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // If one Array is Greater.
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
