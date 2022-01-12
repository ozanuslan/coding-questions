/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def diameterOfBinaryTree(root: TreeNode): Int = {
        var diameter = 0
        def dfs(node: TreeNode): Int = {
            if(node == null) return 0
            
            val right = dfs(node.right)
            val left = dfs(node.left)
            
            diameter = diameter max (left + right)
            
            1 + (left max right)
        }
        dfs(root)
        
        diameter
    }
}
