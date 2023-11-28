import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ15686 {
    static int n, m;
    static ArrayList<int[]> home = new ArrayList<>(), chicken = new ArrayList<>();
    static int[] select;

    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        select = new int[m];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            for (int j = 0; j < n; j++) {
                String check = stringTokenizer.nextToken();
                if (check.equals("1")) {
                    home.add(new int[]{i, j});
                } else if (check.equals("2")) {
                    chicken.add(new int[]{i, j});
                }
            }
        }
        dfs(0, 0);
        System.out.println(ans);
    }

    private static void dfs(int cnt, int start) {
        if (cnt == m) {
            int res = 0;
            for (int[] h : home) {
                int dis = Integer.MAX_VALUE;
                for (int c : select) {
                    dis = Math.min(Math.abs(h[0] - chicken.get(c)[0]) + Math.abs(h[1] - chicken.get(c)[1]), dis);
                }
                res += dis;
            }
            ans = Math.min(ans, res);
            return;
        }
        for (int i = start; i < chicken.size(); i++) {
            select[cnt] = i;
            dfs(cnt + 1, i + 1);
        }

    }
}
