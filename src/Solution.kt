
fun main() {
    println(Solution().solution(4, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)))
}

class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val sortedBag = TangerineBag(tangerine).sortedBag

        val ansList = sortedBag.subList(0, k)
        return ansList.distinct().size
    }
}

data class TangerineBag(private val intArray: IntArray){
    private val bag: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    init {
        intArray.map { bag[it] = bag.getOrDefault(it, mutableListOf()).apply { add(it) } }
    }

    val sortedBag: List<Int>
        get() = bag.toList().sortedByDescending { it.second.size }.toMap().values.flatten()
}