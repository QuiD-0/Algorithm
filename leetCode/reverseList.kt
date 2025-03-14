fun main() {
    Solution()
        .also(::println)
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr: ListNode? = head
        var next: ListNode? = null
        while (curr != null) {
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
}