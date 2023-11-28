import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_SSAFYSUMMER01 {

    static int[][] map = new int[][]{};
    static int[] start, end;
    static ArrayList<Web> webs;
    static int n, m, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int ans = -1;
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            map = new int[n][n];
            start = new int[]{sc.nextInt() - 1, sc.nextInt() - 1};
            end = new int[]{sc.nextInt() - 1, sc.nextInt() - 1};
            webs = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                webs.add(new Web(sc.nextInt() - 1, sc.nextInt() - 1, sc.nextInt(), sc.nextInt()));
            }
            initMap(); // 맵에 그물 투척
            Queue<SharkNode> q = new LinkedList();
            if (map[start[0]][start[1]] != 0) {
                k -= map[start[0]][start[1]];
            }
            q.add(new SharkNode(start[0], start[1], k, 0, map[start[0]][start[0]]));
            boolean visit[][] = new boolean[n][n];
            visit[start[0]][start[1]] = true;
            while (!q.isEmpty()) {
                SharkNode cur = q.poll();
                if (cur.x == end[0] && cur.y == end[1]) {
                    ans = cur.time;
                    break;
                }
                for (int[] d : new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}}) {
                    int nx = cur.x + d[0];
                    int ny = cur.y + d[1];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < n && cur.k > 0 && !visit[nx][ny]) {
                        if (map[nx][ny] > map[cur.x][cur.y]) {
                            cur.k -= Math.abs(map[nx][ny] - map[cur.x][cur.y]);
                        }
                        if (cur.k > 0) {
                            visit[nx][ny] = true;
                            q.add(new SharkNode(nx, ny, cur.k, cur.time + 1, map[nx][ny]));
                        }
                    }
                }
            }
            System.out.printf("#%d %d\n", i, ans);
        }
    }

    private static void initMap() {
        for (Web web : webs) {
            Queue<Web> q = new LinkedList();
            q.add(web);
            map[web.x][web.y] = web.power;
            boolean visit[][] = new boolean[n][n];
            visit[web.x][web.y] = true;
            while (!q.isEmpty()) {
                Web cur = q.poll();
                for (int[] d : new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}}) {
                    int nx = cur.x + d[0];
                    int ny = cur.y + d[1];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < n && cur.distance > 0) {
                        if (!visit[nx][ny]) {
                            visit[nx][ny] = true;
                            q.add(new Web(nx, ny, cur.distance - 1, cur.power));
                            map[nx][ny] += cur.power;
                        }

                    }
                }
            }
        }
    }

    static class Web {
        int x, y, distance, power;

        public Web(int x, int y, int distance, int power) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.power = power;
        }

        @Override
        public String toString() {
            return "Web{" + "x=" + x + ", y=" + y + ", distance=" + distance + ", power=" + power + '}';
        }
    }

    static class SharkNode {
        int x, y, k, time, power;

        public SharkNode(int x, int y, int k, int time, int power) {
            this.x = x;
            this.y = y;
            this.k = k;
            this.time = time;
            this.power = power;
        }

        @Override
        public String toString() {
            return "SharkNode{" +
                    "x=" + x +
                    ", y=" + y +
                    ", k=" + k +
                    ", time=" + time +
                    ", power=" + power +
                    '}';
        }
    }
}
