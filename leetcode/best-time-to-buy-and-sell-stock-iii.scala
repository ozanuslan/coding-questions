object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var buyFirst, buyCompound = Int.MaxValue
        var profitFirst, profitCompound = 0
        
        for(price <- prices) {
            buyFirst = buyFirst min price
            profitFirst = profitFirst max price - buyFirst
            buyCompound = buyCompound min price - profitFirst
            profitCompound = profitCompound max price - buyCompound
        }
        
        profitCompound
    }
}
