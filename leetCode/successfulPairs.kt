fun main() {
    Solution()
        .successfulPairs(intArrayOf(5, 1, 3), intArrayOf(1, 2, 3, 4, 5), 7)
        .also(::println)
}

class Solution {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        potions.sort()

        val answer = IntArray(spells.size)
        spells.forEachIndexed { index, it ->
            answer[index] = potions.size - search(it, success, potions)
        }
        return answer
    }

    private fun search(multiply: Int, target: Long, array: IntArray): Int {
        var min = 0
        var max = array.size - 1
        while (min <= max) {
            val mid = (min + max) / 2
            if (array[mid].toLong() * multiply >= target) {
                max = mid - 1
            } else {
                min = mid + 1
            }
        }
        return min
    }
}