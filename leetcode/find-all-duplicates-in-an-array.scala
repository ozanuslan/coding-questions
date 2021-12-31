object Solution {
    def findDuplicates(nums: Array[Int]): List[Int] = {
        /*
        Idea is simple, reverse the sign of the numbers
        you have encountered. If the value you've encountered
        is negative that means it's a duplicate. To make the 
        solution fit O(1) space constraint we've used
        indices as our markers.
        */
        
        var res = List[Int]()
        
        for(i <- 0 until nums.length) {
            val n = nums(i)
            if(nums(n.abs - 1) > 0) nums(n.abs -1) = -nums(n.abs -1)
            else res = n.abs :: res
        }
        
        res
    }
}
