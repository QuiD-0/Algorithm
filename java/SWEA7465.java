import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA7465 {
    static int[] p;
    static int n,m;

    public static void make() {
        for (int i = 0; i < n; i++) {
            p[i] = i;
        }
    }

    public static int find(int a) {
        if (p[a] == a) {
            return a;
        }
        return p[a] = find(p[a]);
    }
    public static boolean union(int a, int b) {
        int p_a = find(a);
        int p_b = find(b);
        if (p_a == p_b) return false;
        if (p_a <= p_b)
            p[p_b] = p_a;
        else p[p_a] = p_b;
        return true;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            p = new int[n];
            sb.append("#").append(tc).append(" ");
            make();
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1; //1부터 시작하므로 1씩 빼주깅
                union(a, b);
            }
            int init=p[0];
            int count=1;
            for(int i=0;i<n;i++){
                find(i);
            }
            Arrays.sort(p);
            for(int i=0;i<n;i++){
                if (init != p[i]){
                    count++;
                    init=p[i];
                }
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}
