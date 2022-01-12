/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def minDepth(root: TreeNode): Int = {
        if(root == null) return 0
        
        var minDepth = 1
        var foundLeaf = false
        var q = scala.collection.mutable.Queue[TreeNode](root)
        
        // Basic BFS
        while(!q.isEmpty && !foundLeaf) {
            val n = q.knownSize
            
            for(i <- 0 until n) {
                val node = q.dequeue
                if(node.left == null && node.right == null) foundLeaf = true
                if(node.left != null) q.enqueue(node.left)
                if(node.right != null) q.enqueue(node.right)
            }
            
            if(!foundLeaf) minDepth += 1
        }
        
        minDepth
    }
}
