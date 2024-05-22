class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character, int[]> m = new HashMap<>();
        m.put('R', new int[]{0, 1});
        m.put('L', new int[]{0, -1});
        m.put('D', new int[]{1, 0});
        m.put('U', new int[]{-1, 0});

        char[] value = moves.toCharArray();
        int x = 0;
        int y = 0;
        for(char v : value){
            int[] z = m.get(v);
            x += z[0];
            y += z[1];
        }

        return (x == 0 && y == 0);
    }
}