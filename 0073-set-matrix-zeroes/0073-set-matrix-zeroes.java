class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> zero = new ArrayList<>();
        // 0을 찾는다.
        // 0이라면, 해당 행, 열을 모두 0으로 교체한다.
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0) zero.add(new int[]{i, j});
            }
        }

        for(int[] x : zero){
            System.out.println(x[0] + " " + x[1]);
            matrix[x[0]] = new int[matrix[0].length];
            for(int i=0; i<matrix.length; i++){
                matrix[i][x[1]] = 0;
            }
        }
    }
}