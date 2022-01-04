object Solution {
    def coinChange(coins: Array[Int], amount: Int): Int = {
        var dp = new Array[Int](amount + 1)
        
        for(i <- 1 to amount) {
            var minVal = Int.MaxValue
            for(coin <- coins) {
                if(i - coin >= 0 && dp(i - coin) != -1)
                    minVal = if(dp(i - coin) > minVal) minVal else dp(i - coin)
            }
            dp(i) = if(minVal == Int.MaxValue) -1 else minVal + 1
        }
        
        dp(amount)
    }
}
