fun main() {
    println(
        Solution().solution(
            3,
            intArrayOf(4, 2, 2, 5, 3)
        )
    )
}

class Solution {
    fun solution(N: Int, coffee_times: IntArray): IntArray {
        val remain = coffee_times.mapIndexed { index, i -> Coffee(index+1, i) }.toMutableList()
        val q = mutableListOf<Coffee>()
        for (i in 0 until N) {
            if (i < coffee_times.size) {
                q.add(remain.removeAt(0))
            }
        }
        val answer = mutableListOf<Int>()
        while (q.isNotEmpty()) {
            val min = findMin(q)
            answer.addAll(min.map { it.idx })
            q.removeAll(min)
            timeGone(q, min)
            while (q.size < N && remain.isNotEmpty()) {
                q.add(remain.removeAt(0))
            }
        }
        println(answer)
        return answer.toIntArray()
    }
    data class Coffee(val idx: Int, var time: Int)

    private fun timeGone(q: MutableList<Coffee>, min: List<Coffee>) {
        q.forEach {
            it.time -= min[0].time
        }
    }

    private fun findMin(q: List<Coffee>): List<Coffee> {
        var min = q[0]
        for (i in 1 until q.size) {
            if (q[i].time < min.time) {
                min = q[i]
            }
        }
        return q.filter { it.time == min.time }
    }
}