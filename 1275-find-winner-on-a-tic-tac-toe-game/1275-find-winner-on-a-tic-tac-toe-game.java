class Solution {
    public String tictactoe(int[][] moves) {
        int[][] map = new int[3][3];

        int value = 0;
        boolean flag = true;
        for(int[] x : moves){
            map[x[0]][x[1]] = flag ? 1 : -1;
            flag = !flag;
            value++;
        }

        
        for(int i=0; i<map.length; i++){
            int sum = IntStream.of(map[i]).sum();
            if(Math.abs(sum) == 3) return sum > 0 ? "A" : "B"; 
        }

        for(int i=0; i<map.length; i++){
            int sum = 0;
            for(int j=0; j<map.length; j++){
                sum += map[j][i];
            }
            if(Math.abs(sum) == 3) return sum > 0 ? "A" : "B"; 
        }

        if(Math.abs(map[0][0] + map[1][1] + map[2][2]) == 3) 
                return map[0][0] + map[1][1] + map[2][2] > 0 ? "A" : "B"; 

        if(Math.abs(map[0][2] + map[1][1] + map[2][0]) == 3) 
                return map[0][2] + map[1][1] + map[2][0] > 0 ? "A" : "B";
        
        return value == 9 ? "Draw" : "Pending";
    }
}