object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        // First Solution: O(n) Time, O(n) Memory
//         var mem = scala.collection.mutable.Map[Int,Int]()
        
//         nums.foreach(n => {
//             if(mem.contains(n)) mem(n) += 1
//             else mem(n) = 1
            
//             if(mem(n) > nums.length / 2) return n
//         })
        
//         0
        
        // Second Solution: O(n) Time, O(1) Memory
        var majority = 0
        var count = 0
        
        nums.foreach(n => {
            if(count == 0) majority = n
            if(n == majority) count += 1
            else count -= 1
        })
        
        majority
    }
}
