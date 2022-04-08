import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ14502 {
    static int n, m, map[][];
    static int ans = 0;
    static boolean visit[][];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(str.nextToken());
        m = Integer.parseInt(str.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        dfs(0);
        System.out.println(ans);
    }

    private static void dfs(int cnt) {
        if (cnt == 3) {
            int[][] copy = new int[n][m];
            visit = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    copy[i][j] = map[i][j];
                }
            }
            Queue<Point> q = new LinkedList();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (copy[i][j] == 2) {
                        q.add(new Point(i, j));
                    }
                }
            }
            while (!q.isEmpty()) {
                Point cur = q.poll();
                int x = cur.x;
                int y = cur.y;
                visit[x][y] = true;
                for (int[] dxdy : new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}) {
                    int nx = x + dxdy[0];
                    int ny = y + dxdy[1];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visit[nx][ny] && copy[nx][ny] == 0) {
                        copy[nx][ny] = 2;
                        q.add(new Point(nx, ny));
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (copy[i][j] == 0) {
                        count++;
                    }
                }
            }
            ans = Math.max(ans, count);
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 0) {
                        map[i][j] = 1;
                        dfs(cnt + 1);
                        map[i][j] = 0;
                    }
                }
            }
        }
    }
}
