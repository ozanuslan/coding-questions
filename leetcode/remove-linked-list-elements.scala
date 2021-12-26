/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def removeElements(head: ListNode, value: Int): ListNode = {
        if(head == null) return null
        head.next = removeElements(head.next, value)
        if(head.x == value) return head.next
        head
    }
}
