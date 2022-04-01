import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1194 {
    static int n, m;
    static char[][] mat;
    static boolean[][][] visit;
    static int[][] dxdy = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        mat = new char[n][m];
        visit = new boolean[n][m][64];
        Queue<Find> q = new LinkedList();
        int ans = -1;
        for (int i = 0; i < n; i++) {
            str = bf.readLine();
            for (int j = 0; j < m; j++) {
                mat[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == '0') {
                    q.add(new Find(i, j, 0, 0));
                    visit[i][j][0] = true;
                }
            }
        }
        while (!q.isEmpty()) {
            Find cur = q.poll();
            int x = cur.x;
            int y = cur.y;
            int count = cur.count;
            int key = cur.key;
            visit[x][y][key] = true;
            if (mat[x][y] == '1') {
                ans = count;
                break;
            }
            count++;
            for (int[] next : dxdy) {
                int nx = next[0] + x;
                int ny = next[1] + y;
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !(mat[nx][ny] == '#') && !visit[nx][ny][key]) {
                    if (mat[nx][ny] == '.' || mat[nx][ny] == '0' || mat[nx][ny] == '1') {
                        q.add(new Find(nx, ny, key, count));
                    } else if (mat[nx][ny] >= 'A' && mat[nx][ny] <= 'Z') {
                        if ((key & (1 << (mat[nx][ny] - 'A'))) > 0) {
                            q.add(new Find(nx, ny, key, count));
                        }
                    } else if (mat[nx][ny] >= 'a' && mat[nx][ny] <= 'z') {
                        int newKey = (1 << (mat[nx][ny] - 'a')) | key;
                        if (!visit[nx][ny][newKey]) {
                            visit[nx][ny][newKey] = true;
                            q.offer(new Find(nx, ny, newKey, count));
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    static class Find {
        int x, y, key, count;

        public Find(int x, int y, int key, int count) {
            this.x = x;
            this.y = y;
            this.key = key;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Find{" +
                    "x=" + x +
                    ", y=" + y +
                    ", key=" + key +
                    ", count=" + count +
                    '}';
        }
    }
}
