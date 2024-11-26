fun main() {
    Solution()
        .increasingTriplet(intArrayOf(1,2,3,4,5))
        .also(::println)
}

class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        var target = Int.MAX_VALUE
        var min = Int.MAX_VALUE
        for (n in nums) {
            if (n > target) return true
            if (n > min) target = n
            if (n < min) min = n
        }
        return false
    }
}