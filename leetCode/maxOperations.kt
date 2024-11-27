fun main() {
    Solution()
        .maxOperations(intArrayOf(3, 1, 3, 4, 3), 6)
        .also(::println)
}

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()
        var count = 0
        var (l, r) = 0 to nums.size - 1
        while (l < r) {
            val sum = nums[l] + nums[r]
            if (sum == k) {
                count++
                l++
                r--
            } else if (sum < k) {
                l++
            } else {
                r--
            }
        }
        return count
    }
}