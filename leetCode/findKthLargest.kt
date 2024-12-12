import java.util.PriorityQueue

fun main() {
    Solution()
        .findKthLargest(intArrayOf(3,1,2,4,5,6),2)
        .also(::println)
}

class Solution {
    fun findKthLargest(nums: IntArray, k:Int) :Int {
        val heap = PriorityQueue<Int>()
        nums.forEach {
            heap.add(it)
            if(heap.size > k) heap.poll()
        }

        return heap.peek()
    }
}