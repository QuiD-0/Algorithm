fun main() {
    println(Solution().mergeArrays(arrayOf(intArrayOf(1,2), intArrayOf(2,3), intArrayOf(4,5)),
        arrayOf(intArrayOf(1,4), intArrayOf(3,2), intArrayOf(4,1))
    ))
}

class Solution {
    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        val result = mutableListOf<IntArray>()
        val map = mutableMapOf<Int, Int>()
        for (i in nums1.indices) {
            val key = nums1[i][0]
            val value = nums1[i][1]
            map[key] = map.getOrDefault(key, 0) + value
        }
        for (i in nums2.indices) {
            val key = nums2[i][0]
            val value = nums2[i][1]
            map[key] = map.getOrDefault(key, 0) + value
        }
        for (key in map.keys) {
            result.add(intArrayOf(key, map[key]!!))
        }
        return result.sortedWith(compareBy({ it[0] }, { it[1] })).toTypedArray()
    }
}