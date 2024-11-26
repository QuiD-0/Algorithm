fun main() {
    Solution()
        .compress(charArrayOf('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'))
        .also(::println)
}

class Solution {
    fun compress(arr: CharArray): Int {
        var counter = 1
        var idx = 0
        for (i in arr.indices) {
            if (i == arr.lastIndex || arr[i] != arr[i + 1]) {
                arr[idx++] = arr[i]
                if (counter > 1) counter.toString().forEach { arr[idx++] = it }
                counter = 1
            } else counter++
        }
        return idx
    }
}