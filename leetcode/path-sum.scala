/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
        if(root == null) return false
        
        val newTarget = targetSum - root.value
        (newTarget == 0 && root.left == null && root.right == null) || hasPathSum(root.right, newTarget) || hasPathSum(root.left, newTarget)
    }
}
