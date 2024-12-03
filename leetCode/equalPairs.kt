fun main() {
    println(Solution().equalPairs(arrayOf(intArrayOf(3, 2, 1), intArrayOf(1, 7, 6), intArrayOf(2, 7, 7))))
}

class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        val rows = Array(grid.size) { IntArray(grid.size) }
        for(i in grid.indices) {
            for (j in grid.indices) {
                rows[j][i] = grid[i][j]
            }
        }
        var count = 0
        for (i in grid.indices) {
            for (j in rows.indices) {
                if (grid[i].contentEquals(rows[j])) {
                    count++
                }
            }
        }
        return count
    }
}