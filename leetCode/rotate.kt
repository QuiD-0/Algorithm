fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        val rotate = k % n
        val res = IntArray(n)
        for (i in nums.indices) {
            res[(i + rotate) % n] = nums[i]
        }
        for (i in nums.indices) {
            nums[i] = res[i]
        }
    }
}