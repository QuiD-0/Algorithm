fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var left = 1
        var prev = nums[0]
        for(i in 1..<nums.size) {
            if(nums[i] != prev) {
                nums[left] = nums[i]
                prev=nums[i]
                left ++
            }
        }
        return left
    }
}
