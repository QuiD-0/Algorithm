import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA5607 {
    static int n, r;
    static long MOD = 1234567891, fac[];

    public static long pow(long a, long remain) {
        if (remain == 0) return 1;
        else if (remain == 1) return a;
        if (remain % 2 == 0) {
            long temp = pow(a, remain / 2);
            return (temp * temp) % MOD;
        }
        long temp = pow(a, remain - 1) % MOD;
        return (temp * a) % MOD;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        fac = new long[1000001];
        fac[0] = 1;
        for (int i = 1; i < 1000001; i++) {
            fac[i] = fac[i - 1] * i;
            fac[i] %= MOD;
        }
        for (int t = 1; t <= test; t++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            n = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());

            long up = 1, down = 1;
            up = fac[n];
            down = (fac[n - r] * fac[r]) % MOD;
            down = pow(down, MOD - 2);
            System.out.println("#" + t + " " + (up * down) % MOD);
        }
    }
}
