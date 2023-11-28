import java.util.Scanner;

public class BOJ2559 {

    public static void main(String[] args) {
        int n, k;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int ans = sum;
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);

    }
}
