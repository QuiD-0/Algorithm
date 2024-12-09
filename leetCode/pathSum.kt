fun main() {
    Solution()
        .also(::println)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        if (root == null) return 0

        val pathsFromRoot = getSumCount(root, targetSum, 0L)
        val pathsFromLeft = pathSum(root.left, targetSum)
        val pathsFromRight = pathSum(root.right, targetSum)

        return pathsFromRoot + pathsFromLeft + pathsFromRight
    }

    private fun getSumCount(
        root: TreeNode?,
        targetSum: Int,
        sum: Long
    ): Int {
        if (root == null) return 0

        val curSum = sum + root.`val`
        var count = 0

        if (targetSum.toLong() == curSum) count++
        count += getSumCount(root.left, targetSum, curSum)
        count += getSumCount(root.right, targetSum, curSum)

        return count
    }
}