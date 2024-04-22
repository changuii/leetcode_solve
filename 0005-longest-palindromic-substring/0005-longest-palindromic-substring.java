class Solution {
    public String longestPalindrome(String s) {
        String z = s;
        s = "";
        for(char x : z.toCharArray()){
            s = s + "?" + x;
        }
        s += "?";

        
        String max = "";
        for(int i=1; i<s.length()-1; i++){
            // ? a ? a ? -> a
            String current = s.charAt(i)+"";
            int a = 1;
            while(i-a >= 0 && i + a < s.length() && s.charAt(i-a) == s.charAt(i+a)){
                current = s.charAt(i-a) + current + s.charAt(i+a);
                a++;
            }
            if(max.length() < current.length())
                max = current;
        }

        z = "";
        for(char x : max.toCharArray()){
            z += x == '?' ? "" : x;
        }

        return z;
    }
}