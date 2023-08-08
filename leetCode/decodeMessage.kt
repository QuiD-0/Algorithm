fun main() {
    println(Solution().decodeMessage(key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"))
}

class Solution {
    fun decodeMessage(key: String, message: String): String {
        val keySet = key.replace(" ","").toSet()
        val result =  StringBuilder()
        message.forEach {
            if (it != ' ') {
                result.append('a'+ keySet.indexOf(it))
            } else {
                result.append(' ')
            }
        }
        return result.toString()
    }
}