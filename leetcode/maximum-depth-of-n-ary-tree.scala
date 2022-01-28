/**
 * Definition for a Node.
 * class Node(var _value: Int) {
 *   var value: Int = _value
 *   var children: List[Node] = List()
 * }
 */

object Solution {
    def maxDepth(root: Node): Int = {
        getDepth(root, 1)
    }
    
    def getDepth(root: Node, depth: Int): Int = {
        if(root == null) depth - 1
        else if(root.children == null || root.children.length == 0) depth
        else root.children.foldLeft(depth)((acc, child) => acc max getDepth(child, depth + 1))
    }
}
