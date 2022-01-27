/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def pruneTree(root: TreeNode): TreeNode = {
        def postOrder(node: TreeNode, parent: TreeNode) {
            if(node != null) {
                postOrder(node.left, node)
                postOrder(node.right, node)
                if(parent != null) {
                if(node.value != 1 && node.right == null && node.left == null){ if(parent.right == node) parent.right = null else parent.left = null}
                }
            }
        }
        postOrder(root, null)
        if(root.value != 1 && root.right == null && root.left == null) null else root
    }
}
