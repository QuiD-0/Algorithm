fun main() {
    Solution()
        .findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4)
        .also(::println)
}

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0
        for (i in 0..<k) {
            sum += nums[i]
        }
        var max = sum


        for (i in k..<nums.size) {
            sum -= nums[i-k]
            sum += nums[i]
            max = max(sum, max)
        }

        return max.toDouble().div(k)
    }

    private fun max(a:Int, b:Int): Int {
        return if(a>=b) {
            a
        } else {
            b
        }
    }
}