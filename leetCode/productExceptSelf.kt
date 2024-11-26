fun main() {
    Solution()
        .productExceptSelf(intArrayOf(1, 2, 3, 4))
        .also(::println)
}

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val size = nums.size
        val ans = IntArray(size) { 1 }
        val right = IntArray(size) { 1 }
        for (i in 1..<size) {
            ans[i] = nums[i - 1] * ans[i - 1]
        }
        for (i in size - 2 downTo  0) {
            right[i] = nums[i + 1] * right[i + 1]
            ans[i] *= right[i]
        }
        return ans
    }
}