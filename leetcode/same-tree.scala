/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
        // DFS, slow for this question
        if(p == null && q == null) true
        else if(p == null || q == null) false
        else p.value == q.value && isSameTree(p.right, q.right) && isSameTree(p.left, q.left)
    }
}
