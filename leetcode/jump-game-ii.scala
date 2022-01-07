object Solution {
    def jump(nums: Array[Int]): Int = {
        // First solution came to my mind, O(n^2) time O(n) space
//         val n = nums.length
//         var dp = Array.fill[Int](n)(Int.MaxValue)
//         dp(0) = 0
        
//         for(i <- 0 until n) {
//             for(j <- i + 1 to i + nums(i); if(j < n)) {
//                 dp(j) = dp(j) min dp(i) + 1
//             }
//         }
        
//         dp(n - 1)
        
        // Second more optimized solution O(n) time O(1) space
        val n = nums.length
        var jumpCnt, jumpEnd, jumpFurthest = 0
        
        for(i <- 0 until n - 1) {
            jumpFurthest = jumpFurthest max i + nums(i)
            
            if(i == jumpEnd) {
                jumpCnt += 1
                jumpEnd = jumpFurthest
            }
        }
        
        jumpCnt
    }
}
