/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def searchBST(root: TreeNode, `val`: Int): TreeNode = {
        if(root == null) null
        else if(root.value == `val`) root
        else if(root.value > `val`) searchBST(root.left, `val`) else searchBST(root.right, `val`)
    }
}
