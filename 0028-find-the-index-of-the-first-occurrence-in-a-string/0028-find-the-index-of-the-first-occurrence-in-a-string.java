class Solution {
    public int strStr(String haystack, String needle) {
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();


        for(int i=0; i<a.length; i++){
            if(a[i] == b[0] && i + b.length <= a.length){
                String x = haystack.substring(i, i+b.length);
                if(x.equals(needle)) return i;
            }
        }

        return -1;
    }
}