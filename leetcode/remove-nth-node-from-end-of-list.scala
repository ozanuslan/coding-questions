/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
        val start = new ListNode()
        var slow, fast = start
        start.next = head // Set the actual start
        
        for(i <- 0 to n) fast = fast.next // Create the gap with slow pointer
        
        // Move to the end of the array while maintaining the gap
        while(fast != null) {
            slow = slow.next
            fast = fast.next
        }
        
        slow.next = slow.next.next // Skip the deleted element
        
        start.next // Return actual start
    }
}
