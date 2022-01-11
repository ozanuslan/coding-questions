/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def mergeInBetween(list1: ListNode, a: Int, b: Int, list2: ListNode): ListNode = {
        var beginning, end = list1 // Doing this only because a and b are guaranteed to be in the list range
        
        var tempNode = list1
        for(i <- 1 until a) {
            tempNode = tempNode.next
            beginning = tempNode
        }
        for(i <- a to b + 1) {
            tempNode = tempNode.next
            end = tempNode
        }
        
        var list2End = list2
        while(list2End.next != null) list2End = list2End.next
        
        beginning.next = list2
        list2End.next = end
        
        list1
    }
}
