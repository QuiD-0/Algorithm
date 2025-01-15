import kotlin.math.max

fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun rob(nums: IntArray): Int {
        val n = nums.size
        val dp = Array(n + 1) { 0 }
        if (nums.size == 1) return nums[0]

        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])
        for (i in 2..< n) {
            dp[i] = max(nums[i] + dp[i - 2], dp[i - 1])
        }
        return dp[n-1]
    }
}