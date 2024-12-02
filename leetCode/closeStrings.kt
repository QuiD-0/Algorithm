fun main() {
    Solution()
        .closeStrings("abc", "bca")
        .also(::println)
}

class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        return when {
            word1.length != word2.length -> false
            word1.toSet() != word2.toSet() -> false
            word1.getFrequencyList() != word2.getFrequencyList() -> false
            else -> true
        }
    }

    private fun String.getFrequencyList(): List<Int> {
        return groupBy { it }.map { it.value.size }.sorted()
    }
}