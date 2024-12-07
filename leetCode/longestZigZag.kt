fun main() {
    Solution()
        .also(::println)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    var ans = 0
    fun longestZigZag(root: TreeNode): Int {
        root.left?.let { calculate(it, true, 1) }
        root.right?.let { calculate(it, false, 1) }
        return ans
    }

    private fun calculate(root: TreeNode, isLeft: Boolean, count: Int) {
        ans = maxOf(ans, count)
        if (isLeft) {
            root.left?.let { calculate(it, true, 1) }
            root.right?.let { calculate(it, false, 1 + count) }
        } else {
            root.left?.let { calculate(it, true, 1 + count) }
            root.right?.let { calculate(it, false, 1) }
        }
    }
}