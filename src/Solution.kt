fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun majorityElement(nums: IntArray): Int {
        nums.sort()

        return nums[nums.size/2]
    }
}