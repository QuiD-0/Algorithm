internal class Solution {
    fun solution(T: IntArray, A: IntArray): Int {
        val n = T.size
        val tree = mutableMapOf<Int, MutableList<Int>>()

        for (i in 1 until n) {
            tree.computeIfAbsent(T[i]) { mutableListOf() }.add(i)
        }

        val skillSet = mutableSetOf<Int>()
        for (skill in A) {
            var curr = skill
            while (curr !in skillSet) {
                skillSet.add(curr)
                curr = T[curr]
            }
        }

        return skillSet.size
    }
}
