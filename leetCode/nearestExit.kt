fun main() {
    Solution()
        .nearestExit(
            arrayOf(
                charArrayOf('+','+','.','+'),
                charArrayOf('.','.','.','+'),
                charArrayOf('+','+','+','.'),
            ),
            intArrayOf(1,2)
        )
        .also(::println)
}

class Solution {
    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val m = maze.size
        val n = maze[0].size

        val visited = Array(m) { BooleanArray(n) { false } }
        val queue = ArrayDeque<Node>()
        val direction = arrayOf(
            0 to 1,
            0 to -1,
            1 to 0,
            -1 to 0
        )

        queue.add(Node(entrance[0], entrance[1], 0))
        visited[entrance[0]][entrance[1]] = true
        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            val row = node.x
            val col = node.y

            if ((row == 0 || col == 0 || row == m - 1 || col == n - 1)
                && !(row == entrance[0] && col == entrance[1])
                && (maze[row][col] == '.')
            ) {
                return node.cost
            }

            for ((dx, dy) in direction) {
                val newX = row + dx
                val newY = col + dy

                if (newX in 0 until m
                    && newY in 0 until n
                    && !visited[newX][newY]
                    && maze[newX][newY] == '.'
                ) {
                    queue.add(Node(newX, newY, node.cost + 1))
                    visited[newX][newY] = true
                }
            }
        }
        return -1
    }
}

data class Node(
    val x: Int,
    val y: Int,
    val cost: Int
)