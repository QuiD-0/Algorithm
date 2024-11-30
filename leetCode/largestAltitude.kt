fun main() {
    Solution()
        .largestAltitude(intArrayOf(-4,-3,-2,-1,4,3,2))
        .also(::println)
}

class Solution {
    fun largestAltitude(gain: IntArray): Int {
        val result = IntArray(gain.size + 1) { 0 }
        var max = 0
        for (i in 1..gain.size) {
            result[i] = result[i - 1] + gain[i - 1]
            max = maxOf(max, result[i])
        }
        return max
    }
}