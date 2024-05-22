class Solution {
    public char findTheDifference(String s, String t) {
        
        int i=0;
        int j=0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i++) != t.charAt(j++)){
                return t.charAt(j-1);
            }
        }

        return t.charAt(j);
    }
}