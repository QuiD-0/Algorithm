class Solution {
    fun countBits(n: Int) = IntArray(n + 1).apply {
        for (i in 0..n)
          this[i] = this[i / 2] + (i and 1)
      }
}