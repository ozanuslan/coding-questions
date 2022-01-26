/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def distributeCoins(root: TreeNode): Int = {
        var moveCount = 0
        if(root.left != null) {
            moveCount += distributeCoins(root.left)
            root.value += root.left.value - 1
            moveCount += (root.left.value - 1).abs
        }
        if(root.right != null) {
            moveCount += distributeCoins(root.right)
            root.value += root.right.value - 1
            moveCount += (root.right.value - 1).abs
        }
        moveCount
    }
}
