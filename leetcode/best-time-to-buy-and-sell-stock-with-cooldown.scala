object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var sell, rest = 0
        var hold = Int.MinValue
        
        for(p <- prices) {
            val prevSell = sell
            sell = hold + p
            hold = hold max rest - p
            rest = rest max prevSell
        }
        
        sell max rest
    }
}
