fun main() {
    Solution()
        .combinationSum3(2, 18)
        .also(::println)
}

class Solution {
    val queue = ArrayDeque<Node>()
    val ans: MutableList<MutableList<Int>> = mutableListOf()

    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        for (i in 1..9) {
            queue.add(Node(1, mutableListOf(i)))
        }
        while (queue.isNotEmpty()) {
            bfs(k, n)
        }
        return ans
    }

    private fun bfs(k: Int, n: Int) {
        val data = queue.removeFirst()
        println(data)
        if (data.same(k, n)) {
            ans.add(data.list)
        } else {
            val start = data.list.max() + 1
            for (i in start..9) {
                val next = data.next(i)
                if (next.isPossible(k, n)) {
                    queue.add(next)
                }
            }
        }
    }
}

data class Node(
    val level: Int,
    val list: MutableList<Int>
) {
    fun next(num: Int): Node {
        return this.copy(level = level + 1, list = list.addAndReturn(num))
    }

    fun isPossible(k: Int, n: Int): Boolean {
        if (list.size > k) return false
        if (list.sum() > n) return false
        return true
    }

    fun same(k: Int, n: Int): Boolean {
        if (list.size == k) {
            if (list.sum() == n) {
                return true
            }
        }
        return false
    }

    private fun MutableList<Int>.addAndReturn(num: Int): MutableList<Int> {
        val list = mutableListOf<Int>()
        this.forEach { list.add(it) }
        list.add(num)
        return list
    }
}
