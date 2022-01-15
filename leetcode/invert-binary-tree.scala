/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def invertTree(root: TreeNode): TreeNode = {
        if(root == null) return null
        
        // Standard BFS, constantly change subtree left node references with right ones
        val q = scala.collection.mutable.Queue[TreeNode](root)
        
        while(!q.isEmpty) {
            val node = q.dequeue
            val right = node.right
            node.right = node.left
            node.left = right
            
            if(node.left != null) q.enqueue(node.left)
            if(node.right != null) q.enqueue(node.right)
        }
        
        root
    }
}
