fun main() {
    println(Solution().minimumBoxes(intArrayOf(1,3,2), intArrayOf(4,3,1,5,2)))
}

class Solution {
    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        capacity.sortDescending()

        var capacityIdx = 0
        var appleSize = apple.sum()

        while (appleSize > 0) {
            println("$appleSize, $capacityIdx")
            appleSize -= capacity[capacityIdx]
            capacityIdx += 1
        }

        return capacityIdx
    }
}