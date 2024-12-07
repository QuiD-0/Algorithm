fun main() {
    Solution()
        .also(::println)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0

        return 1 + maxOf((maxDepth(root.left)), maxDepth(root.right))
    }
}