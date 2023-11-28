import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= t; tc++) {
            int sum = 0;
            int n = Integer.parseInt(br.readLine());
            int mid = n / 2;

            for (int i = 0; i < n; i++) {
                String tmp = br.readLine();
                for (int j = 0; j < n; j++) {
                    if (i < mid) {
                        if (mid - i <= j && j <= mid + i) {
                            sum += tmp.charAt(j) - '0';
                        }
                    } else if (i > mid) {
                        if (mid - (n - i - 1) <= j && j <= mid + (n - i - 1)) {
                            sum += tmp.charAt(j) - '0';
                        }
                    } else {
                        sum += tmp.charAt(j) - '0';
                    }
                }
            }
            sb.append("#" + tc + " " + sum + "\n");
        }
        System.out.println(sb);
    }
}
