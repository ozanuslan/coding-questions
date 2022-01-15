/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def isSubtree(root: TreeNode, subRoot: TreeNode): Boolean = {
        if(root == null) false
        else isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || (if(root.value == subRoot.value) isSameTree(root, subRoot) else false)
    }
    
    def isSameTree(root1: TreeNode, root2: TreeNode): Boolean = {
        if(root1 == null && root2 == null) true
        else if(root1 == null) false
        else if(root2 == null) false
        else root1.value == root2.value && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right)
    }
}
