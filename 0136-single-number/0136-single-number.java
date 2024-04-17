class Solution {
    public int singleNumber(int[] nums) {
        // 모든 값을 XOR하면 홀수개의 숫자가 나온다.
        int x = 0;
        for(int num : nums){
            x ^= num;
        }

        return x;


    }
}