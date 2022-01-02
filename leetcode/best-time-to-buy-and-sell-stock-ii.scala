object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var profit = 0
        var currentStock = prices(0)
        
        for(i <- 0 until prices.length - 1) {
            val nextPrice = prices(i + 1)
            if(nextPrice > currentStock) 
                profit += nextPrice - currentStock
                
            currentStock = nextPrice
        }
        
        profit
    }
}
