import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
                else if(nums[nums.length-1-i] + nums[nums.length-1-j] == target){
                    return new int[] {nums.length-1-j, nums.length-1-i};
                }
            }
        }
        return new int[] {0, 0};
       
    }
}