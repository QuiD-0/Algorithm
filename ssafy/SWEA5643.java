import java.util.ArrayList;
import java.util.Scanner;

public class SWEA5643 {
    static int t, n, m;
    static ArrayList<Integer>[] big;
    static int[] count;
    static boolean[] vis;
    static int temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            n = sc.nextInt();
            m = sc.nextInt();
            big = new ArrayList[n + 1];
            count = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                big[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                big[a].add(b);
            }


            for (int i = 1; i <= n; i++) {
                temp = 0;
                vis = new boolean[n + 1];
                dfs(i, i);
                count[i] += temp;//나보다 큰 애들
            }


            int total = 0;
            for (int i = 1; i <= n; i++) {
//				System.out.print(count[i]+" ");
                if (count[i] == n) total += 1;
            }
            System.out.printf("#%d %d\n", tc, total);

        }
    }

    private static void dfs(int cur, int start) {
        temp += 1;
        for (int i = 0; i < big[cur].size(); i++) {
            int next = big[cur].get(i);
            if (vis[next]) continue;
            vis[next] = true;
            count[next] += 1;//next보다 작은 친구들이 업데이트 해준다
            dfs(next, start);
        }
    }
}