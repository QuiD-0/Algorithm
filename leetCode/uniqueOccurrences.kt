import kotlin.streams.asSequence

fun main() {
    Solution()
        .uniqueOccurrences(intArrayOf(1, 2))
        .also(::println)
}

class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        val groupBy = arr.groupBy { it }
        for ((k, v) in groupBy) {
            val size = v.size
            if(set.contains(size)) {
                return false
            }
            set.add(size)
        }
        return true
    }
}