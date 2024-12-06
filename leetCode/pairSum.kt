import java.util.*

fun main() {
    Solution()
        .also(::println)
}


var li = ListNode(5)
var v = li.`val`

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun pairSum(head: ListNode?): Int {
        var slow: ListNode? = head
        var fast: ListNode? = head
        var ans = 0
        val stack = Stack<Int>()
        while(fast != null) {
            stack.add(slow?.`val`)
            slow = slow?.next
            fast = fast.next?.next
        }
        while(slow != null) {
            val pop = stack.pop()
            ans = maxOf(ans, pop+slow.`val`)
            slow = slow.next
        }
        return ans
    }
}