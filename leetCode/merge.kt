fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var k = nums1.size - 1

        while (j >= 0) {
            nums1[k--] = when {
                (i < 0) -> nums2[j--]
                (nums1[i] > nums2[j]) -> nums1[i--]
                else -> nums2[j--]
            }
        }
    }
}