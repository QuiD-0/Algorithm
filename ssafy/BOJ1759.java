import java.util.Arrays;
import java.util.Scanner;

public class BOJ1759 {
    static int l, c;
    static String[] alpha;
    static String[] ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        l = sc.nextInt();
        c = sc.nextInt();
        sc.nextLine();
        alpha = sc.nextLine().split(" ");
        Arrays.sort(alpha);
        ans = new String[l];
        find(0, 0);
    }

    private static void find(int cnt, int start) {
        if (cnt >= l) {
            int count = 0;
            int noCount = 0;
            for (String a : ans) {
                if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
                    count++;
                } else {
                    noCount++;
                }
            }
            if (count != 0 && noCount >= 2) {
                System.out.println(String.join("", ans));
            }
            return;
        }
        for (int i = start; i < c; i++) {
            ans[cnt] = alpha[i];
            find(cnt + 1, i + 1);
        }
    }
}
