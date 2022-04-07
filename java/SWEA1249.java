import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SWEA1249 {
    static int[][] map;
    static boolean[][] visit;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int tc = 1; tc <= t; tc++) {
            n = Integer.parseInt(bf.readLine());
            map = new int[n][n];
            visit = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                StringTokenizer str = new StringTokenizer(bf.readLine());
                String[] strs = str.nextToken().split("");
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(strs[j]);
                }
            }
            PriorityQueue<Pos> q = new PriorityQueue<Pos>();
            q.add(new Pos(0, 0, 0));
            visit[0][0] = true;
            while (!q.isEmpty()) {
                Pos cur = q.poll();
                int x = cur.x;
                int y = cur.y;
                int cost = cur.cost;
                if (x == n - 1 && y == n - 1) {
                    System.out.printf("#%d %d\n", tc, cost);
                    break;
                }
                for (int[] dxdy : new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}}) {
                    int nx = x + dxdy[0];
                    int ny = y + dxdy[1];
                    if (isVaild(nx, ny)) {
                        q.add(new Pos(nx, ny, cost + map[nx][ny]));
                        visit[nx][ny] = true;
                    }
                }

            }
        }

    }

    private static boolean isVaild(int nx, int ny) {
        if (nx < 0 || ny < 0 || nx >= n || ny >= n || visit[nx][ny]) {
            return false;
        }
        return true;
    }

    static class Pos implements Comparable<Pos> {
        int x, y, cost;

        public Pos(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pos o) {
            return this.cost - o.cost;
        }

    }
}
