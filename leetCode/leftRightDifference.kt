fun main() {
    println(Solution().leftRightDifference(intArrayOf(10,4,8,3)))
}

class Solution {
    fun leftRightDifference(nums: IntArray): IntArray {
        var leftSum = 0
        var rightSum = nums.sum()

        for ((index, item) in nums.withIndex()) {
            rightSum -= item
            nums[index] = Math.abs(leftSum - rightSum)
            leftSum += item
        }

        return nums
    }
}