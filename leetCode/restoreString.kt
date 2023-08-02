fun main() {
    println(Solution().restoreString("abc", intArrayOf(1,0,2)))
}

class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        val ans: Array<Char> = Array(indices.size) { ' ' }
        indices.forEachIndexed { index, i ->
            ans[i] = s.get(index)
        }
        return ans.joinToString("")
    }
}