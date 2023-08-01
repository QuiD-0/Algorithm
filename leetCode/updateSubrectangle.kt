fun main() {
    println(Solution(arrayOf(intArrayOf(1,2,1), intArrayOf(4,3,4), intArrayOf(3,2,1),
        intArrayOf(1,1,1)
    )))
}

class Solution(
    rectangle:  Array<IntArray>
) {
    val arr = rectangle
    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for(i in row1..row2){
            for(j in col1..col2){
                arr[i][j]=newValue
            }
        }
    }

    fun getValue(row: Int, col: Int): Int {
        return arr[row][col]
    }
}