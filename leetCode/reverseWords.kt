fun main() {
    Solution()
        .reverseWords("a good   example")
        .also(::println)
}

class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ")
            .filter { it.isNotEmpty() }
            .reversed()
            .joinToString(" ")
    }
}