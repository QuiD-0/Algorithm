import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA1953 {
    static int[][] map;
    static boolean[][] visit;
    static int n, m, x, y, time;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            n = Integer.parseInt(stringTokenizer.nextToken());
            m = Integer.parseInt(stringTokenizer.nextToken());
            x = Integer.parseInt(stringTokenizer.nextToken());
            y = Integer.parseInt(stringTokenizer.nextToken());
            time = Integer.parseInt(stringTokenizer.nextToken());
            map = new int[n][m];
            visit = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                stringTokenizer = new StringTokenizer(bf.readLine());
                for (int j = 0; j < m; j++) {
                    map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }
            Queue<Pos> q = new LinkedList();
            q.add(new Pos(x, y, 1));
            visit[x][y] = true;
            while (!q.isEmpty()) {
//                System.out.println("q = " + q)
                Pos cur = q.poll();
                int tunnel = map[cur.x][cur.y];
                int[][] next = next(tunnel);
                for (int[] dxdy : next) {
                    int nx = cur.x + dxdy[0];
                    int ny = cur.y + dxdy[1];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visit[nx][ny] && map[nx][ny] != 0) {
                        if (cur.time >= time) continue;
                        boolean check = false;
                        for (int[] a : next(map[nx][ny])) {
                            int cx = nx + a[0];
                            int cy = ny + a[1];
                            if (cx == cur.x && cy == cur.y) {
                                check = true;
                            }
                        }
                        if (check) {
                            visit[nx][ny] = true;
                            q.add(new Pos(nx, ny, cur.time + 1));
                        }
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (visit[i][j]) count++;
                }
            }
            System.out.printf("#%d %d\n", tc, count);
        }
    }

    private static int[][] next(int tunnel) {
        switch (tunnel) {
            case 1:
                return new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            case 2:
                return new int[][]{{1, 0}, {-1, 0}};
            case 3:
                return new int[][]{{0, 1}, {0, -1}};
            case 4:
                return new int[][]{{-1, 0}, {0, 1}};
            case 5:
                return new int[][]{{1, 0}, {0, 1}};
            case 6:
                return new int[][]{{1, 0}, {0, -1}};
            case 7:
                return new int[][]{{-1, 0}, {0, -1}};
        }
        return new int[][]{{0, 0}};
    }

    static class Pos {
        int x, y, time;

        @Override
        public String toString() {
            return "Pos{" +
                    "x=" + x +
                    ", y=" + y +
                    ", time=" + time +
                    '}';
        }

        public Pos(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

}
