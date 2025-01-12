import kotlin.math.ceil

fun main() {
    Solution()
        .minEatingSpeed(intArrayOf(30,11,23,4,20), 6)
        .also(::println)
}


class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var (l, r) = 1 to piles.max()

        while (l < r) {
            val mid = l + (r - l) / 2
            if(eatable(piles, h, mid)) {
                r = mid
            } else {
                l = mid + 1
            }
        }
        return l
    }

    private fun eatable(piles: IntArray, h: Int, i: Int): Boolean {
        var sum = 0
        for (t in piles) {
            sum += ceil(t.toDouble() / i).toInt()
        }

        return sum <= h
    }
}