class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];

        int total = 0;
        for(char x : s.toCharArray()){
            a[x - 'a']++;
        }
        for(char x : t.toCharArray()){
            a[x - 'a']--;
        }

        for(int c : a){
            if(c != 0) return false;
        }

        return true;
    }
}