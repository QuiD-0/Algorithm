import kotlin.math.max

fun main() {
    Solution()
        .maxVowels("tryhard", 4)
        .also(::println)
}

class Solution {
    fun maxVowels(s: String, k: Int): Int {
        var count = 0
        for (i in 0..<k) {
            if (isVowels(s[i])) {
                count++
            }
        }
        var max = count

        for (i in k..<s.length) {
            if (isVowels(s[i-k])) {
                count --
            }
            if ( isVowels(s[i])) {
                count ++
            }
            max = max(max, count)
            println(max)
        }
        return max
    }

    private fun isVowels(c: Char): Boolean {
        return (
                c == 'a' ||
                        c == 'e' ||
                        c == 'i' ||
                        c == 'o' ||
                        c == 'u'
                )
    }
}