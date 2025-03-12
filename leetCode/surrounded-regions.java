import java.awt.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    static class Solution {
        public void solve(char[][] board) {
            int n = board.length;
            int m = board[0].length;
            Queue<Point> queue = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                if (board[i][0] == 'O') queue.add(new Point(i, 0));
                if (board[i][m - 1] == 'O') queue.add(new Point(i, m - 1));
            }
            for (int j = 0; j < m; j++) {
                if (board[0][j] == 'O') queue.add(new Point(0, j));
                if (board[n - 1][j] == 'O') queue.add(new Point(n - 1, j));
            }

            bfs(queue, board, n, m);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == 'O') {
                        board[i][j] = 'X';
                    } else if (board[i][j] == '#') {
                        board[i][j] = 'O';
                    }
                }
            }
        }

        private void bfs(Queue<Point> queue, char[][] board, int n, int m) {
            Point[] directions = {new Point(0, 1), new Point(0, -1), new Point(1, 0), new Point(-1, 0)};

            while (!queue.isEmpty()) {
                Point p = queue.poll();
                if (board[p.x][p.y] == 'O') {
                    board[p.x][p.y] = '#';
                    for (Point dir : directions) {
                        int nx = p.x + dir.x;
                        int ny = p.y + dir.y;
                        if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 'O') {
                            queue.add(new Point(nx, ny));
                        }
                    }
                }
            }
        }
    }
}
