fun main() {
    Solution()
        .longestSubarray(intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1))
        .also(::println)
}

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        val units = mutableListOf(0)
        nums.forEach {
            if (it == 1) units[units.lastIndex]++ else units.add(0)
        }
        println(units)
        return when (units.size) {
            1 -> units.first() - 1
            else -> units.zipWithNext { a, b -> a + b }.max()
        }
    }
}