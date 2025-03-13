import java.awt.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    static class Solution {
        Point[] dxdy = {new Point(1,0), new Point(-1, 0 ), new Point(0, 1), new Point(0, -1)};
        public int numIslands(char[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int ans = 0;
            for(int i = 0;i<n;i++) {
                for(int j = 0;j<m;j++) {
                    if(grid[i][j] == '1'){
                        clean(grid,n,m,i,j);
                        ans+=1;
                    }
                }
            }
            return ans;
        }

        public void clean(char[][] grid, int n, int m, int x, int y) {
            Queue<Point> q = new ArrayDeque<>();
            q.add(new Point(x, y));

            while (!q.isEmpty()) {
                Point p = q.poll();
                if (grid[p.x][p.y] == '0') {
                    continue;
                } else {
                    grid[p.x][p.y] = '0';
                }

                for (Point dir : dxdy) {
                    int nx = p.x + dir.x;
                    int ny = p.y + dir.y;
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && grid[nx][ny] == '1') {
                        q.add(new Point(nx, ny));
                    }
                }
            }
        }
    }
}
