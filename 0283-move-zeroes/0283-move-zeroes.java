class Solution {
    public void moveZeroes(int[] nums) {
        
        int index = 0;
        int i = 0;
         while(i < nums.length){
            if(nums[i] != 0 && nums[index] == 0){
                swap(nums, index++, i++);
            }else if(nums[i] == 0){
                i++;
            }else{
                index++;
                i = index;
            }
         }

    }

    public void swap(int[] arr, int i, int y){
        int temp = arr[i];
        arr[i] = arr[y];
        arr[y] = temp;
    }
}