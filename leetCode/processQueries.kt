fun main() {
    println(Solution().processQueries(intArrayOf(3, 1, 2, 1), 5))
}

class Solution {
    fun processQueries(queries: IntArray, m: Int): IntArray {
        val arr = MutableList(m) { it+1 }
        var res = intArrayOf()
        queries.forEach {
            val index = arr.indexOf(it)
            arr.removeAt(index)
            arr.add(0, it)
            res += index
        }
        return res
    }
}