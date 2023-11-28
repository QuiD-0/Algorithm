public class DP01 {
    public static void main(String[] args) {
        int[][] dp = new int[9][2];
        int blue = 0, yellow = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;

        dp[2][0] = 1;
        dp[2][1] = 2;
        for (int i = 3; i < 9; i++) {
            dp[i][yellow] = dp[i - 1][blue] + dp[i - 1][yellow];
            dp[i][blue] = dp[i - 1][yellow];
        }
//        System.out.println(Arrays.toString(dp));
        System.out.println(dp[8][blue] + dp[8][yellow]);
    }
}
