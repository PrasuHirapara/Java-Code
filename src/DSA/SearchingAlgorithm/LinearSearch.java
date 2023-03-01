package DSA.SearchingAlgorithm;

public class LinearSearch {
    //  Time Complexity O(N)
    public int linearsearch(int[] nums,int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }
}
