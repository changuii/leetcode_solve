class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean s = nums[nums.length-1] - nums[0] > 0 ? true : false;
        for(int i=1; i<nums.length; i++){
            if(s){
                if(nums[i] - nums[i-1] < 0) return false;
            }else{
                if(nums[i] - nums[i-1] > 0) return false;
            }
        }
        return true;
    }
}