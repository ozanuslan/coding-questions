/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def deleteDuplicates(head: ListNode): ListNode = {
        if(head == null || head.next == null) return head
        head.next = deleteDuplicates(head.next)
        return if(head.x == head.next.x) head.next else head
    }
}
