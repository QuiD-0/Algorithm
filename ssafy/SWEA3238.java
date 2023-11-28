import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA3238 {
    static long[] fac = new long[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer str = new StringTokenizer(bf.readLine());
            long n = Long.parseLong(str.nextToken());
            long r = Long.parseLong(str.nextToken());
            long p = Long.parseLong(str.nextToken());
            fac[0] = 1;
            for (int i = 1; i <= p; i++) {
                fac[i] = (i * fac[i - 1]) % p;
            }
            long ans = 1;
            while (r != 0 || n != 0) {
                long x = n % p;
                long y = r % p;
                if (y > x) {
                    ans = 0;
                    break;
                }
                ans = ((ans * fac[(int) x]) % p);
                for (int i = 0; i < p - 2; i++) {
                    ans = ((ans * fac[(int) (x - y)] * fac[(int) y]) % p);
                }
                n /= p;
                r /= p;
            }
            ans %= p;
            System.out.printf("#%d %d\n", tc, ans);
        }
    }
}
