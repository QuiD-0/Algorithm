fun main() {
    Solution()
        .also(::println)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leftNode = mutableListOf<Int>()
        val rightNode = mutableListOf<Int>()

        find(root1, leftNode)
        find(root2, rightNode)

        return leftNode == rightNode
    }

    private fun find(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) {}
        else if (root?.left == null && root?.right == null) {
            list.add(root!!.`val`)
        } else {
            find(root.left, list)
            find(root.right, list)
        }
    }
}