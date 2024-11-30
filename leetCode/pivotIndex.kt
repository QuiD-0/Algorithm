fun main() {
    Solution()
        .pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))
        .also(::println)
}

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val size = nums.size
        val left = IntArray(size + 1) { 0 }
        val right = IntArray(size + 1) { 0 }

        nums.forEachIndexed { index, i ->
            left[index + 1] = left[index] + i
        }
        nums.reversed().forEachIndexed { index, i ->
            right[index + 1] = right[index] + i
        }

        for (i in 0 until size) {
            if (left[i] == right[size - 1 - i]) return i
        }
        return -1
    }
}