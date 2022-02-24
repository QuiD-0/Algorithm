import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO1681 {

    static int n;
    static int[][] cost;
    static boolean[] visit;
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cost = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            for (int j = 0; j < n; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visit = new boolean[n];
        visit[0] = true;
        go(1, 0, 0);
        System.out.println(ans);
    }


    private static void go(int cnt, int cur, int sum) {
        if (sum > ans) return;
        if (cnt == n) {
            if (cost[cur][0] != 0 && ans > sum + cost[cur][0]) {
                ans = sum + cost[cur][0];
            }
            return;
        }
        for (int i = 1; i < n; i++) {
            if (cost[cur][i] == 0 || visit[i]) continue;
            visit[i] = true;
            go(cnt + 1, i, sum + cost[cur][i]);
            visit[i] = false;
        }
    }
}
