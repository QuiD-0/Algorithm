import java.util.PriorityQueue

fun main() {
    Solution()
        .also(::println)
}

class SmallestInfiniteSet() {
    var cur = 1
    var added = PriorityQueue<Int>()

    fun popSmallest(): Int {
        return if (added.isEmpty()) cur++
        else added.poll()
    }

    fun addBack(num: Int) {
        if (num < cur && num !in added) added.add(num)
    }
}