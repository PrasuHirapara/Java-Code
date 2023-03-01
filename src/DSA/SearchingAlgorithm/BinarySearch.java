package DSA.SearchingAlgorithm;

public class BinarySearch {
    // Time Complexity O(N logN)
    public int binarySearch(int[] nums,int target){
        return search(nums,target,0,nums.length);
    }

    private int search(int[] nums, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            return search(nums,target,mid+1,nums.length-1);
        }
        else if(nums[mid] > target){
            return search(nums,target,start,mid-1);
        }

        return -1;
    }
}
