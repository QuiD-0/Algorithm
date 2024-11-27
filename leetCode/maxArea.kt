fun main() {
    Solution()
        .maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
        .also(::println)
}

class Solution {
    fun maxArea(height: IntArray): Int {
        var (left, right) = 0 to height.size - 1
        var result = 0

        while (left < right) {
            val currentMax = min(height[left], height[right]) * (right - left)
            result = max(result, currentMax)
            if (height[left] > height[right]) {
                right--
            } else {
                left++
            }
        }
        return result
    }

    private fun min(a: Int, b: Int): Int {
        return if (a <= b) {
            a
        } else {
            b
        }
    }

    private fun max(a: Int, b: Int): Int {
        return if (a >= b) {
            a
        } else {
            b
        }
    }
}