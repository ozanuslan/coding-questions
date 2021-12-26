/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def isPalindrome(head: ListNode): Boolean = {
        if(head.next == null) return true
        
        var slow = head
        var fast = head
        
        while(fast != null && fast.next != null) {
            slow = slow.next
            fast = fast.next.next
        }
        
        if(fast != null) slow = slow.next
        
        var reversed = reverseLinkedList(slow)
        
        var ptr = head
        while(reversed != null) {
            if(ptr.x != reversed.x) return false
            ptr = ptr.next
            reversed = reversed.next
        }
        
        true
    }
    
    def reverseLinkedList(node: ListNode): ListNode = {
        if(node == null || node.next == null) return node
        var prev: ListNode = null
        var curr = node
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
