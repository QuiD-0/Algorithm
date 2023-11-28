import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA1861 {
    static int[][] mat;
    static int[] ans;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int tc = 1; tc <= t; tc++) {
            n = Integer.parseInt(bf.readLine());
            mat = new int[n][n];
            for (int i = 0; i < n; i++) {
                String str = bf.readLine();
                StringTokenizer st = new StringTokenizer(str);
                for (int j = 0; j < n; j++) {
                    mat[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            ans = new int[n * n + 1]; //1부터 시작
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    check(i, j);
                }
            }
            int max = 0, idx = 0;
            for (int i = n; i > 0; i--) {
                if (max <= ans[i]) {
                    max = ans[i];
                    idx = i;
                }
            }
            System.out.println("#" + tc + " " + idx + " " + max);
        }
    }

    private static void check(int x, int y) {
        int init = mat[x][y];
        int count = 1;
        Queue q = new LinkedList();
        q.offer(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] cur = (int[]) q.poll();
            int nx, ny;
            nx = cur[0];
            ny = cur[1];
            for (int[] pos : new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}}) {
                int dx = nx + pos[0];
                int dy = ny + pos[1];
                if (dx >= 0 && dy >= 0 && dx < n && dy < n) {
                    if (mat[dx][dy] == mat[nx][ny] + 1) {
                        q.offer(new int[]{dx, dy});
                        count++;
                    }
                }
            }
        }
        ans[init] = count;
    }
}
