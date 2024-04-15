import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] temp = nums.clone();
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length-1;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == target ) break;
            else if(sum < target) i++;
            else {
                j--;
            }
        }
        System.out.println(i + " " + j);
        boolean flag1 = false;
        boolean flag2 = false;
        for(int x=0; x<temp.length; x++){
            if(nums[i] == temp[x] && !flag1){ 
                i = x;
                flag1 = true;
            }else if(nums[j] == temp[x] && !flag2){ 
                j = x;
                flag2 = true;
            }
            if(flag1 && flag2) return new int[] {i, j};
        }
        
        return new int[] {i, j};
    }
}