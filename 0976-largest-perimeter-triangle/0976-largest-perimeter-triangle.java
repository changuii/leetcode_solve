class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for(int i=nums.length-1; i>1; i--){
            for(int j=i-1; j>0; j--){
                for(int x=j-1; x>=0; x--){
                    if(nums[i] < nums[j] + nums[x]) return nums[i] + nums[j] + nums[x];
                }
            }
        }
        return 0;
    }
}