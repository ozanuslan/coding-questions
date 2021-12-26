/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
        if(list1 == null) list2
        else if(list2 == null) list1
        else if(list1.x > list2.x) {
            list2.next = mergeTwoLists(list1, list2.next)
            list2
        } else {
            list1.next = mergeTwoLists(list1.next, list2)
            list1
        }
    }
}
