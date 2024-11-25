fun main() {
    Solution()
        .reverseVowels("IceCreAm")
        .also(::println)
}

class Solution {
    fun reverseVowels(s: String): String {
        val words = s.toCharArray()
        val indexArr = mutableListOf<Int>()
        val vowelArr = mutableListOf<Char>()
        words.forEachIndexed { index, e ->
            if (isVowels(e)) {
                indexArr.add(index)
                vowelArr.add(e)
            }
        }
        indexArr.reversed().forEachIndexed { index: Int, i: Int ->
            words[i] = vowelArr[index]
        }
        return words.joinToString("")
    }

    private fun isVowels(char: Char): Boolean {
        return char == 'a' || char == 'A' ||
                char == 'e' || char == 'E' ||
                char == 'i' || char == 'I' ||
                char == 'o' || char == 'O' ||
                char == 'u' || char == 'U'
    }
}