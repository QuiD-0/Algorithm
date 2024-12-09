import java.util.*

fun main() {
    Solution()
        .also(::println)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) return result

        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val size = queue.size
            var rightmost = -1

            for (i in 0 until size) {
                val node = queue.poll()
                rightmost = node.`val`

                if (node.left != null) queue.offer(node.left)
                if (node.right != null) queue.offer(node.right)
            }

            result.add(rightmost)
        }

        return result
    }
}