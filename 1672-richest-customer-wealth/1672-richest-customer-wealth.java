class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] x : accounts){
            max = Math.max(max, IntStream.of(x).sum());
        }
        return max;
    }
}