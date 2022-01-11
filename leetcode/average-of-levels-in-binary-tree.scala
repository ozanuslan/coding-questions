/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def averageOfLevels(root: TreeNode): Array[Double] = {
        if(root == null) return Array[Double]()
        
        // Default BFS implementation
        var l = List[Double]()
        var q = scala.collection.mutable.Queue[TreeNode]()
        
        q.enqueue(root)
        while(!q.isEmpty) {
            val size = q.knownSize
            var sum: Double = 0
            
            for(i <- 0 until size) {
                val node = q.dequeue
                sum += node.value
                if(node.left != null) q.enqueue(node.left)
                if(node.right != null) q.enqueue(node.right)
            }
            
            l = (sum / size) :: l
        }
        
        l.reverse.toArray
    }
}
