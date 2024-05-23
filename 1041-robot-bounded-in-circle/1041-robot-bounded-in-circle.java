class Solution {
    static int direction = 3;
    public boolean isRobotBounded(String instructions) {
        // 서, 남, 동, 북 
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int[] coordinate = {0, 0};
        char[] value = instructions.toCharArray();
        for(int i=0; i < 4; i++){
            move(coordinate,value, dx, dy );
            if(coordinate[0] == 0 && coordinate[1] == 0) return true;
        }

        return false;
    }

    public void move(int[] coordinate, char[] value, int[] dx, int[] dy){
        for(char x : value){
            if(x == 'G'){
                coordinate[0] += dx[direction];
                coordinate[1] += dy[direction];
            }
            else if(x == 'L'){
                direction = (direction + 1) % 4;
            }
            else{
                direction = (direction + 3) % 4;
            }
        }
    }
}