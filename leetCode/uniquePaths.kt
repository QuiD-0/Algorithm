fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val dp = Array(m) { Array(n) { 1 }}

        for (i in 1 ..< m) {
            for (j in 1 ..< n ){
                dp[i][j] = dp[i-1][j] + dp[i][j-1]
            }
        }
        return dp[m-1][n-1]
    }
}