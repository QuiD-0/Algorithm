fun main() {
    println(Solution().countKDifference(intArrayOf(1, 2, 2, 1), 1))
}

class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>()
        var count = 0
        for(num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
            count += map.getOrDefault(num - k, 0) + map.getOrDefault(num + k, 0)
        }
        return count
    }
}