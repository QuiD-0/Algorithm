fun main() {
    Solution()
        .letterCombinations("23")
        .also(::println)
}

class Solution {
    private val map = mutableMapOf(
        '2' to listOf('a', 'b', 'c'),
        '3' to listOf('d', 'e', 'f'),
        '4' to listOf('g', 'h', 'i'),
        '5' to listOf('j', 'k', 'l'),
        '6' to listOf('m', 'n', 'o'),
        '7' to listOf('p', 'q', 'r', 's'),
        '8' to listOf('t', 'u', 'v'),
        '9' to listOf('w', 'x', 'y', 'z')
    )

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()

        var res = listOf<String>("")
        digits.forEach {
            res = res.combine(map.getOrDefault(it, emptyList()))
        }
        return res
    }

    private fun List<String>.combine(letter: List<Char>): List<String> {
        return letter.flatMap { c -> this.map { it + c } }
    }
}
