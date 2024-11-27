fun main() {
    Solution()
        .isSubsequence("abc", "ahbgdc")
        .also(::println)
}

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var a = 0
        val size = s.length

        for (i in t.indices) {
            if (size > a && s[a] == t[i]) {
                a++
            }
        }

        return s.length == a
    }
}