/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def mergeTrees(root1: TreeNode, root2: TreeNode): TreeNode = {      
        if(root1 == null) if(root2 != null) TreeNode(root2.value) else null
        else if(root2 == null) if(root1 != null) TreeNode(root1.value) else null
        else {
            val res = TreeNode(root1.value + root2.value)
            res.right = mergeTrees(root1.right, root2.right)
            res.left = mergeTrees(root1.left, root2.left)
            res
        }
    }
}
