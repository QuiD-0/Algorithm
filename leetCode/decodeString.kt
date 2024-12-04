import java.util.*

fun main() {
    Solution()
        .also(::println)
}

class Solution {
    fun decodeString(s: String): String {
        val numStack = LinkedList<Int>()
        val strStack = LinkedList<String>()
        var result = ""
        var num = 0
        var repeat = 0
        var firstString = ""
        for (i in s) {
            when (i){
                in '0'..'9' -> {
                    num = num * 10 + (i - '0')
                }
                '[' -> {
                    numStack.push(num)
                    strStack.push(result)
                    num = 0
                    result = ""
                }
                ']' -> {
                    repeat = numStack.pop()
                    firstString = strStack.pop()
                    result = firstString + result.repeat(repeat)
                }

                else -> {
                    result += i
                }
            }
        }
        return result
    }
}