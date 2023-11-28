import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ7576 {
    static class Tomato implements Comparable<Tomato> {
        int day;
        int x;
        int y;

        public Tomato(int day, int x, int y) {
            this.day = day;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Tomato o) {
            return this.day - o.day;
        }
    }

    static int n, m;
    static int[][] mat;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        mat = new int[m][n];
        PriorityQueue q = new PriorityQueue();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int pos = sc.nextInt();
                mat[i][j] = pos;
                if (pos == 1) {
                    q.offer(new Tomato(0, i, j));
                    mat[i][j] = -1;
                }
            }
        }
        while (!q.isEmpty()) {
            Tomato cur = (Tomato) q.poll();
            mat[cur.x][cur.y] = cur.day;
            for (int[] d : new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}) {
                int nx = cur.x + d[0];
                int ny = cur.y + d[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && mat[nx][ny] == 0) {
                    q.offer(new Tomato(cur.day + 1, nx, ny));
                }
            }
        }
        boolean flag = false;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    flag = true;
                    break;
                }
                ans = Math.max(ans, mat[i][j]);
            }
        }
        System.out.println((flag) ? -1 : ans);
    }

}
