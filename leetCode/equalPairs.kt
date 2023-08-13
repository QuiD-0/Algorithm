fun main() {
    println(Solution().equalPairs(arrayOf(intArrayOf(3, 2, 1), intArrayOf(1, 7, 6), intArrayOf(2, 7, 7))))
}

class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        var pairs = 0
        grid.forEach{ row ->
            for (i in row.indices) {
                for(j in row.indices) {
                    if (grid[j][i] == row[j]) {
                        if (j == row.size - 1) {
                            pairs ++
                        }
                    } else {
                        break
                    }
                }
            }
        }
        return pairs
    }
}