fun main() {
    Solution()
        .also(::println)
}

class RecentCounter() {
    private val queue = Queue()

    fun ping(t: Int): Int {
        queue.add(t)
        return queue.getCount()
    }

}

data class Queue(
    private val deque: ArrayDeque<Int> = ArrayDeque()
) {
    fun add(num: Int) {
        deque.add(num)
        while (deque[0] < deque.last() -RANGE) {
            deque.removeFirst()
        }
    }

    fun getCount():Int {
        return deque.size
    }


    companion object {
        const val RANGE: Int = 3000
    }
}