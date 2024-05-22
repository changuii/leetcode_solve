class Solution {
    public String mergeAlternately(String word1, String word2) {
        String answer = "";
        int i=0;
        int j=0;
        while(word1.length() > i && word2.length() > j){
            answer += word1.charAt(i++);
            answer += word2.charAt(j++);
        }

        while(word1.length() > i){
            answer += word1.charAt(i++);
        }
        while(word2.length() > j){
            answer += word2.charAt(j++);
        }
        return answer;


    }
}