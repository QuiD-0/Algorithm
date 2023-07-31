fun main() {
    println(Solution().createTargetArray(intArrayOf(1,2,3,4,0), intArrayOf(0,1,2,3,0)))
}

class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val arr = mutableListOf<Int>()
        nums.forEachIndexed { idx,it ->
            arr.add(index[idx],it)
        }
        return arr.toIntArray()
    }
}