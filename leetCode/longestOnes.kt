fun main() {
    Solution()
        .longestOnes(intArrayOf(1,0,0,1,1,1,1,0,0,1), 2)
        .also(::println)
}

class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var left = 0
        var k = k

        for (right in nums.indices) {
            if (nums[right] == 0) {
                k--
            }

            if (k < 0) {
                if (nums[left] == 0) {
                    k++
                }
                left++
            }
        }
        return nums.size - left
    }
}