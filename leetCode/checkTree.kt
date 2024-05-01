fun main() {
    println(Solution().checkTree(TreeNode(1).apply {
        left = TreeNode(1)
        right = TreeNode(1)
    })) // false
}

class Solution {
    fun checkTree(root: TreeNode?): Boolean {
        return root!!.`val` == (root.left!!.`val` + root.right!!.`val`)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}