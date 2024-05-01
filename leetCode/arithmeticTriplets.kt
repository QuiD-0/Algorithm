fun main() {
    println(Solution().arithmeticTriplets(intArrayOf(0, 1, 4, 6, 7, 10), 3))
}

class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val set :HashSet<Int> = nums.toHashSet()
        var count = 0
        for (i in nums.indices) {
            if (set.contains(nums[i] - diff) && set.contains(nums[i] - 2 * diff)) {
                count++
            }
        }
        return count
    }
}