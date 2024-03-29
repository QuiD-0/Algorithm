class Solution {
    fun solution(n: Int): Long {
        var answer: Long = 0
        val dp = LongArray(n + 1)
        dp[0]=1
        dp[1]=1
        for (i in 2..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567
        }
        answer = dp[n]
        return answer
    }
}