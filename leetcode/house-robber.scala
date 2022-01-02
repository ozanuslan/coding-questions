object Solution {
    def rob(nums: Array[Int]): Int = {
        /*
        The idea here using DP is to store the max possible
        value that you can achieve by looking two steps back.
        Simply compare last stored value with the current
        number plus the value stored two steps back (non-adj interval)
        */
        
        if(nums.length == 1) return nums(0)
        
        var dp = new Array[Int](nums.length)
        dp(0) = nums(0)
        dp(1) = dp(0) max nums(1)
        
        for(i <- 2 until nums.length) {
            dp(i) = dp(i - 1) max nums(i) + dp(i - 2)
        }
        
        dp(dp.length - 1)
    }
}
