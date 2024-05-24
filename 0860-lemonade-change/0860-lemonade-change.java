class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int[] count = new int[3];
        for(int b : bills){
            int value = b-5;
            if(value == 0){
                count[0]++;
            }
            // 20원 -> 10원 5원 or 5원 x 3
            else if(value == 15){
                if(count[1] > 0 && count[0] > 0){
                    count[1]--;
                    count[0]--;
                }
                else if(count[0] >= 3){
                    count[0] -= 3;
                }else{
                    return false;
                }
            }
            // 10원 -> 5원
            else{
                if(count[0] < 1) return false;
                count[0]--;
                count[1]++;
            }
        }
        return true;
    }
}