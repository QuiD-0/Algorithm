public class DP02 {
    public static void main(String[] args) {
        int[] dp = new int[7];
        dp[1] = 2;
        dp[2] = 5;
        for (int i = 3; i < 7; i++) {
            dp[i] = dp[i - 1] + 1 + dp[i - 2] * 2;
        }
//        System.out.println("Arrays.toString(dp) = " + Arrays.toString(dp));
        System.out.println(dp[6]);
    }
}
