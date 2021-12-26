/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def reverseList(head: ListNode): ListNode = {
        if(head == null || head.next  == null) return head
        
        var prev: ListNode = null
        var curr = head
        var next = curr.next
        
        while(curr != null) {
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        
        prev
    }
}
