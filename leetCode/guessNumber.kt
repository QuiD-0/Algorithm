fun main() {
    Solution()
        .guessNumber(10)
        .also(::println)
}

open class GuessGame {

    val pick = 6

    fun guess(num:Int):Int {
        return if(pick < num) -1
        else if(pick == num) 0
        else 1
    }
    open fun guessNumber(n: Int): Int {
        return 0
    }
}

class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var max = n
        var min = 1
        while(true) {
            val mid = min + (max - min) / 2
            val guess = guess(mid)
            when(guess(mid)) {
                -1 -> max = mid - 1
                1 -> min = mid + 1
                0 -> return mid
            }
        }
    }
}