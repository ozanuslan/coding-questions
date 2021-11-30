/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let sum;
    let carry;
    let head;
    let currNode;
    let lastNode;
    let l1Val;
    let l2Val;
    
    l1Val = l1.val;
    l2Val = l2.val;
    sum = l1Val + l2Val;
        if(sum >= 10){
            sum %= 10;
            carry = 1;
        }
    lastNode = new ListNode(sum , null);
    head = lastNode;
    l1 = l1.next;
    l2 = l2.next;
    while(l1 !== null || l2 !== null){
        l1Val = (l1 === null) ? 0 : l1.val;
        l2Val = (l2 === null) ? 0 : l2.val;
        if(carry > 0){
            sum = l1Val + l2Val + carry;
            carry = 0;
        } else sum = l1Val + l2Val;
        if(sum >= 10){
            sum %= 10;
            carry = 1;
        }
        currNode = new ListNode(sum, null);
        lastNode.next = currNode;
        lastNode = currNode;
        if(l1 !== null)
        l1 = l1.next;
        if(l2 !== null)
        l2 = l2.next;
    }
    if(carry > 0){
        lastNode.next = new ListNode(1, null);}
    return head;
};
