object Solution {
    def canJump(nums: Array[Int]): Boolean = {
        // Quite bad solution that came to my mind first
        // It's meaningless to keep track of the indices you can visit
        // for this question.
//         val n = nums.length
//         var dp = Array.fill[Boolean](n)(false)
//         var maxLen = 0 // Optimization to not re-mark a length we can already cover
        
//         dp(0) = true
//         for(i <- 0 until n) {
//             if(dp(i) && i + nums(i) > maxLen) {
//                 for(j <- i + 1 to i + nums(i); if(j < n)) {
//                     dp(j) = true
//                 }
//                 maxLen = i + nums(i)
//             }
//         }
        
//         dp(n - 1)
        
        // Second solution that I came up with while trying
        // the first solution
        val n = nums.length
        var maxReach = nums(0)
        val target = n - 1
        
        for(i <- 0 until n - 1; if(maxReach < target); if(maxReach >= i))
            maxReach = maxReach max i + nums(i)
        
        maxReach >= target
    }
}
