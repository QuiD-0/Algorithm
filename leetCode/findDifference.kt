import kotlin.streams.asSequence

fun main() {
    Solution()
        .findDifference(intArrayOf(1,2,3), intArrayOf(1,1,2,2))
        .also(::println)
}

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val toList1 = nums1.toSet().parallelStream()
            .filter { nums2.contains(it).not() }
            .toList()

        val toList2 = nums2.toSet().parallelStream()
            .filter { nums1.contains(it).not() }
            .toList()

        return listOf(toList1, toList2)
    }
}