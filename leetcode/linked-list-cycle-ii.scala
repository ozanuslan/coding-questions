/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */

object Solution {
    def detectCycle(head: ListNode): ListNode = {
        // O(n) time O(n) space
        // val set = scala.collection.mutable.Set[ListNode]()
        // var curr = head
        // while(curr != null) {
        //     if(set.contains(curr)) return curr
        //     else set.add(curr)
        //     curr = curr.next
        // }
        // null
        
        // O(n) time O(1) space
        var fast = head
        var slow = head
        
        do {
            if(fast == null || fast.next == null) return null
            fast = fast.next.next
            slow = slow.next
        } while(fast != slow)
        
        
        var begin = head
        while(begin != fast) {
            fast = fast.next
            begin = begin.next
        }
        
        begin
    }
}
