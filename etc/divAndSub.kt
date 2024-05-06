fun main() {
    println(Solution().solution("011100"))
}

class Solution {
    fun solution(S: String): Int {
        val zeroRemoved = removeFrontZeros(S)
        var count = 0
        for (i in zeroRemoved.indices) {
            if (zeroRemoved[i] == '0') {
                count++
            } else {
                count += 2
            }
        }
        return count - 1
    }

    private fun removeFrontZeros(S: String): String {
        var count = 0
        var zeroRemoved = ""
        for (i in S.indices) {
            if (S[i] == '0') {
                count++
            } else {
                zeroRemoved = S.substring(i)
                break
            }
        }
        return zeroRemoved
    }
}