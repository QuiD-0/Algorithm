fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun isPalindrome(s: String): Boolean {
        return s.filter { it.isLetterOrDigit() }
            .run { equals(reversed(), true) }
    }
}