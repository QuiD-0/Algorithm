import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ4485 {
    private static int N;
    private static int[][] map;
    private static int[][] distances;
    private static int INF = Integer.MAX_VALUE;
    private static int[] dr = {-1, 0, 1, 0};
    private static int[] dc = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = 0;
        while (true) {
            N = sc.nextInt();
            if (N == 0) return;
            map = new int[N][N];
            distances = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                    distances[i][j] = INF;
                }
            }
            System.out.println("Problem " + (++testCnt) + ": " + bfs());
        }
    }

    static int bfs() {
        PriorityQueue<Point> queue = new PriorityQueue<>();
        queue.add(new Point(0, 0, map[0][0]));
        distances[0][0] = map[0][0];
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int r = point.r;
            int c = point.c;
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nc >= 0 && nr < N && nc < N && distances[nr][nc] > distances[r][c] + map[nr][nc]) {
                    distances[nr][nc] = distances[r][c] + map[nr][nc];
                    queue.add(new Point(nr, nc, distances[nr][nc]));
                }
            }
        }
        return distances[N - 1][N - 1];
    }

    static class Point implements Comparable<Point> {
        int r;
        int c;
        int cost;

        public Point(int r, int c, int cost) {
            this.r = r;
            this.c = c;
            this.cost = cost;
        }

        @Override
        public int compareTo(Point o) {
            return cost - o.cost;
        }
    }
}
