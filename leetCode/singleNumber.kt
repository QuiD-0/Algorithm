fun main() {
    println(Solution().singleNumber(intArrayOf(0,1,0,1,0,1,99)))
}

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var ans = 0
        for(i in nums){
            ans = ans xor i
        }
        return ans
    }
}