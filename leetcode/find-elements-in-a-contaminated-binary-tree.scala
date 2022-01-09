/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
class FindElements(_root: TreeNode) {

    def find(target: Int): Boolean = {
        findByNode(_root, target)
    }
    
    def findByNode(node: TreeNode, target: Int): Boolean = {
        if(node == null) false
        else {
            if(node.value == target) true
            else {
                if(node.left != null) node.left.value = 2 * node.value + 1
                if(node.right != null) node.right.value = 2 * node.value + 2
                
                findByNode(node.right, target) || findByNode(node.left, target)
            }
        }
    }
    
    _root.value = 0
    
}

/**
 * Your FindElements object will be instantiated and called as such:
 * var obj = new FindElements(root)
 * var param_1 = obj.find(target)
 */
