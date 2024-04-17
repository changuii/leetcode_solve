class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        for(int i=1; i<nums.length-1; i++){
            if(nums[i-1] == nums[i]) continue;
            else if(i == 1)return nums[i-1];

            if(nums[i+1] != nums[i]) return nums[i];
        }
        return nums[nums.length-1];
    }
}