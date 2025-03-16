internal class Solution {
    fun solution(A: IntArray): Int {
        if (A.size == 1) return 1

        var maxLength = 1
        var currentLength = 1

        for (i in 1 until A.size) {
            if (i == 1 || (A[i] == A[i - 2])) {
                currentLength++
            } else {
                currentLength = 2
            }
            maxLength = maxOf(maxLength, currentLength)
        }

        return maxLength
    }
}
