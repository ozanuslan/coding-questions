/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
        val dummy = new ListNode(0)
        var prev = dummy
        
        var n1 = l1
        var n2 = l2
        var carry = 0
        
        while(n1 != null || n2 != null) {
            val x = if(n1 != null) n1.x else 0
            val y = if(n2 != null) n2.x else 0
            val total = x + y + carry
            carry = total / 10
            prev.next = new ListNode(total % 10)
            prev = prev.next
            if(n1 != null) n1 = n1.next
            if(n2 != null) n2 = n2.next
        }
        
        if(carry > 0) prev.next = new ListNode(carry)
        dummy.next
    }
}
