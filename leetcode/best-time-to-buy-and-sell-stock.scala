object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var maxProfit = 0
        var minSoFar = Int.MaxValue
        
        for(i <- 0 until prices.length - 1) {
            minSoFar = minSoFar min prices(i)
            maxProfit = maxProfit max prices(i+1) - minSoFar
        }
        
        maxProfit
    }
}
