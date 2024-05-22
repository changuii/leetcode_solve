class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            int value = digits[i] + 1;
            if(value != 10) {
                digits[i] = value;
                break;
            }
            digits[i] = 0;
        }
        if(digits[0] == 0){
            int[] answer = new int[digits.length+1];
            answer[0] = 1;
            for(int i=1; i<answer.length; i++){
                answer[i] = digits[i-1];
            }
            return answer;
        }

        return digits;
    }
}