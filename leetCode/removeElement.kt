fun main() {
    Solution()
        .also(::println)
}


class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var left = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[left] = nums[i]
                left++
            }
        }
        return left
    }
}
