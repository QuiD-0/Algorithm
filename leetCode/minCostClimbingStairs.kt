import kotlin.math.min

fun main() {
    Solution()
        .minCostClimbingStairs(intArrayOf(10, 15, 20))
        .also(::println)
}

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val n = cost.size
        val dp = Array(n + 1) { 0 }

        for (i in 2..n) {
            dp[i] = min(cost[i - 1] + dp[i - 1], dp[i - 2] + cost[i - 2])
        }
        return dp[n]
    }
}