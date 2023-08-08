fun main() {
    println(Solution().maxIncreaseKeepingSkyline(arrayOf(intArrayOf(3,0,8,4),
        intArrayOf(2,4,5,7), intArrayOf(9,2,6,3), intArrayOf(0,3,1,0)
    )))
}

class Solution {
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        val n = grid.size
        val rows = IntArray(n)
        val cols = IntArray(n)
        for(i in grid.indices){
            for(j in grid[0].indices){
                rows[i] = maxOf(rows[i], grid[i][j])
                cols[j] = maxOf(cols[j], grid[i][j])
            }
        }

        var ans = 0
        for(i in grid.indices){
            for(j in grid[0].indices){
                ans += minOf(rows[i],cols[j])-grid[i][j]
            }
        }
        return ans
    }
}