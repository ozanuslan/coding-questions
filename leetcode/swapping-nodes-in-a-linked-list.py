# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        # time = O(n), space O(1)
        swap_idx = k - 1
        slow = fast = leader = head

        for i in range(swap_idx):
            # get leader ahead to scout for the end of the list
            leader = leader.next
            # put slow pointer in its swap position
            slow = slow.next
        
        # move fast pointer to its swap location
        while leader.next != None:
            leader = leader.next
            fast = fast.next
        
        temp = slow.val
        slow.val = fast.val
        fast.val = temp
        
        return head
