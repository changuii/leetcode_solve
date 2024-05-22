import java.util.StringTokenizer;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s);

        String x = "";
        while(st.hasMoreTokens()){
            x = st.nextToken();
        }
        return x.length();
    }
}