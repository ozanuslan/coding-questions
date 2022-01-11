/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def sumRootToLeaf(root: TreeNode): Int = {
        // O(n) T O(h) S (recursion stack)
        dfsSum(root, 0)
    }
    
    def dfsSum(node: TreeNode, runningSum: Int): Int = {
        if(node == null) 0
        else {
            val newSum = runningSum * 2 + node.value
            if(node.left == null && node.right == null) newSum else dfsSum(node.left, newSum) + dfsSum(node.right, newSum)
        }
    }
}
