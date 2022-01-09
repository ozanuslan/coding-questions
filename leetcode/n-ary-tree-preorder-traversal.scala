/**
 * Definition for a Node.
 * class Node(var _value: Int) {
 *   var value: Int = _value
 *   var children: List[Node] = List()
 * }
 */

object Solution {
    def preorder(root: Node): List[Int] = {
        if(root == null) Nil
        else root.value :: root.children.flatMap(preorder)
    }
}
