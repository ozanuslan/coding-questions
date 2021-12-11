/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def getDecimalValue(head: ListNode): Int = {
        var strBin = 
        var len = 0
        var node = head
        while(node != null){
            strBin += node.x.toString
            len += 1
            node = node.next
        }
        
        Integer.parseInt(strBin, 2)
    }
}
