import kotlin.math.max

fun main() {
    Solution()
        .mergeAlternately("abc", "pqr")
        .also(::println)
}

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val sb = StringBuilder()
        val maxLength=max(word1.length, word2.length)

        for(i in 0 until maxLength){
            if(i<word1.length) sb.append(word1[i])
            if(i<word2.length) sb.append(word2[i])
        }

        return sb.toString()
    }
}
