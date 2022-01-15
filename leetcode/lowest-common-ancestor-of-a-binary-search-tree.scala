/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */

object Solution {
    def lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode = {
        lowestCommonAncestorN(root, (p.value max q.value), (p.value min q.value))
    }
    
    def lowestCommonAncestorN(root: TreeNode, largeVal: Int, smallVal: Int): TreeNode = {
        if(root.value > largeVal) lowestCommonAncestorN(root.left, largeVal, smallVal)
        else if(root.value < smallVal) lowestCommonAncestorN(root.right, largeVal, smallVal)
        else root
    }
    
}
