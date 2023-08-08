fun main() {
    println(Solution().sortTheStudents(arrayOf(intArrayOf(10,6,9,1), intArrayOf(7,5,11,2),
        intArrayOf(4,8,3,15)
    ),2))
}

class Solution {
    fun sortTheStudents(score: Array<IntArray>, k: Int): Array<IntArray> {
        score.sortBy { t -> -t[k] }
        return score
    }
}