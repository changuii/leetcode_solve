import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int current = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            char value = s.charAt(i);
            if(map.containsKey(value)){
                current = 0;
                i = map.get(value);
                map = new HashMap<>();
                continue;
            }
            current++;
            map.put(value, i);
            max = max > current ? max : current;
        }

        return max;
    }
}