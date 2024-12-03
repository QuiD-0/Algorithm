import java.util.Stack

fun main() {
    Solution()
        .removeStars("leet**cod*e")
        .also(::println)
}

class Solution {
    fun removeStars(s: String): String {
        val stack = Stack<Char>()
        for (char in s) {
            if (char == '*') {
                stack.pop()
            } else {
                stack.add(char)
            }
        }
        return stack.joinToString("")
    }
}