public class _59_generateMatrix_dxdy {
    //用偏移量
    public int[][] generateMatrix(int n) {
        //用偏移量
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int[][]res = new int [n][n];
        int x = 0, y = 0, dir = 0;
        //循环每一步
        for(int cnt = 1; cnt <= n * n; cnt++){
            //将当前位置的值赋值给res
            res[x][y] = cnt;
            //如果当前位置的坐标x+dx[dir]小于0或者大于n或者y+dy[dir]小于0或者大于n，则将dir取反
            if(x + dx[dir] < 0 || x + dx[dir] >= n || y + dy[dir] < 0 || y + dy[dir] >= n)
                dir = (dir + 1) % 4;
            //如果res[x+dx[dir]][y+dy[dir]]大于0，则将dir取反
            else if(res[x + dx[dir]][y + dy[dir]] > 0)
                dir = (dir + 1) % 4;
            //否则，将dir赋值给x+dx[dir]，y+dy[dir]
            x += dx[dir];
            y += dy[dir];
        }
        return res;
    }
}