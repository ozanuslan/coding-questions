/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */

object Solution {
    def bstToGst(root: TreeNode): TreeNode = {
        var sum = 0
        def dfs(node: TreeNode): Unit = {
            if (node == null) return
            dfs(node.right)
            sum += node.value
            node.value = sum
            dfs(node.left)
        }
        dfs(root)
        root
    } 
}