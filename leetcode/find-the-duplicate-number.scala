object Solution {
    def findDuplicate(nums: Array[Int]): Int = {
        /*
        Simple idea is that if all numbers can be mapped to an index
        travelling through the values of the array will create a cycle
        if there are more than two values pointing to the same index
        because both will point to the same point you will have to start
        your path again that will get you to the other number that is duplicated
        
        So, in this approach we create two pointers travelling through
        the array at different speeds, and have them meet up at a certain
        point in the cycle. Then, we reset one of the pointers to 0 because
        the question restrictions state that all numbers in the array are 
        between 0 and length of the array, so it is impossible to accidentally
        assign our pointer to the value it had found through the cycle tracking
        process. After one of the pointers have been reset, we move both pointers
        at the same speed, eventually they will meet the starting point of the
        cycle, meaning the number that is duplicated.
        */
        if(nums.length > 1) {
            var slow = nums(0)
            var fast = nums(nums(0))
            
            while(slow != fast) {
                slow = nums(slow)
                fast = nums(nums(fast))
            }
            
            fast = 0
            
            while(slow != fast) {
                slow = nums(slow)
                fast = nums(fast)
            }
            
            fast
        } else -1
    }
}
