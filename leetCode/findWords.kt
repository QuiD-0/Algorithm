
fun main() {
    println(Solution().findWords(arrayOf("Hello", "Alaska", "Dad", "Peace","omk","adsdf","sfd")))
}

class Solution {
    fun findWords(words: Array<String>): Array<String> {
        val keyboard = mapOf(
            1 to "qwertyuiop".split(""),
            2 to "asdfghjkl".split(""),
            3 to "zxcvbnm".split("")
        )
        val result = mutableListOf<String>()

        words.forEach { word ->
            word.lowercase()
                .split("")
                .asSequence()
                .distinct()
                .filter { it.isNotEmpty() }
                .map { char ->
                    keyboard.filter { it.value.contains(char) }.keys.first()
                }
                .distinct()
                .toList()
                .let { if (it.size == 1) result.add(word) }
        }
        return result.toTypedArray()
    }
}