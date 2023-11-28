import java.util.Scanner;

public class BOJ1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] num = new boolean[n + 1];
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {

            for (int j = 2; j <= n / i; j++) {
                if (num[i * j] == true) {
                    continue;
                } else {
                    num[i * j] = true;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (num[i] == false) {
                System.out.println(i);
            }
        }
    }
}
