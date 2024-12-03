import java.util.Stack

fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val s = Stack<Int>()

        for (i in 0..asteroids.lastIndex) {
            while (s.isNotEmpty() && asteroids[i] < 0 && s.peek() > 0) {
                val diff = asteroids[i] + s.peek()
                when {
                    diff < 0 -> s.pop()
                    diff > 0 -> asteroids[i] = 0
                    else -> { asteroids[i] = 0; s.pop() }
                }
            }
            if (asteroids[i] != 0) s += asteroids[i]
        }

        return s.toIntArray()
    }
}