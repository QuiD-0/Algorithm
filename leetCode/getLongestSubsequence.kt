fun main() {
    println(Solution())
}

class Solution {
    fun getLongestSubsequence(words: Array<String>, groups: IntArray): List<String> {
        val list: MutableList<String> = ArrayList()
        var c = -1
        for (i in words.indices) {
            if (groups[i] !== c) {
                c = groups[i]
                list.add(words[i])
            }
        }
        return list
    }
}