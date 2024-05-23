class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int d = 0;
        boolean[][] V = new boolean[matrix.length][matrix[0].length];

        int x = 0;
        int y = 0;
        
        // 1. 현재 방향으로 이동하다가 벽이거나, 이미 방문한 지역이라면 방향을 90도 회전한다.
        while(answer.size() < matrix.length * matrix[0].length){
            V[x][y] = true;
            answer.add(matrix[x][y]);
            int xValue = 0;
            int yValue = 0;
            for(int i=0; i<4; i++){
                xValue = x + dx[d];
                yValue = y + dy[d];
                if(xValue < 0 || xValue >= matrix.length 
                || yValue < 0 || yValue >= matrix[0].length || V[xValue][yValue]){
                    d = (d + 1) % 4;
                }else break;
            }
            x = xValue;
            y = yValue;
        }


        return answer;
    }
}