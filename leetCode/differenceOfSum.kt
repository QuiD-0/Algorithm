fun main() {
    println(Solution().differenceOfSum(intArrayOf(1,15,6,3)))
}

class Solution {
    fun differenceOfSum(nums: IntArray): Int {
        val sum = nums.sum()
        val digitSum = nums.joinToString("").split("").filter { it != "" }.sumOf { it.toInt() }
        return Math.abs(sum-digitSum)
    }
}
