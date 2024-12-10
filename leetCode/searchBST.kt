fun main() {
    Solution()
        .also(::println)
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        var ans = root
        while (ans != null) {
            val item = ans.`val`
            if(item == `val`) {
                return ans
            } else if(item < `val`) {
                ans = ans.right
            } else {
                ans = ans.left
            }
        }
        return null
    }
}