/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def insertIntoBST(root: TreeNode, value: Int): TreeNode = {  
        if(root == null) TreeNode(value)
        else {
            if(root.value > value) root.left = insertIntoBST(root.left, value)
            else root.right = insertIntoBST(root.right, value)

            root
        }
    }

}
