/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    var maxDepth = 0
    var runningSum = 0
    def deepestLeavesSum(root: TreeNode): Int = {
        maxDepth = 0
        runningSum = 0
        traverseTree(root, 0)
        runningSum
    }
    
    def traverseTree(node: TreeNode, currDepth: Int): Unit ={
        if(node != null){
            if(currDepth == maxDepth) {
                runningSum += node.value
            } else if (currDepth > maxDepth) {
                maxDepth = currDepth
                runningSum = node.value
            }
            traverseTree(node.right, currDepth+1)
            traverseTree(node.left, currDepth+1)
        }
    }
}