fun main() {
    println(Solution().maximumOddBinaryNumber("0101"))
}

class Solution {
    fun maximumOddBinaryNumber(s: String): String {
        var ones = s.count { it == '1' }

        val stringBuilder = StringBuilder()
        for(i in 0..s.length-2) {
            if(ones>1) {
                stringBuilder.append("1")
                --ones
            }
            else stringBuilder.append("0")
        }
        stringBuilder.append("1")

        return stringBuilder.toString()
    }
}
