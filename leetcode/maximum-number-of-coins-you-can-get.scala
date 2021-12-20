object Solution {
    def maxCoins(piles: Array[Int]): Int = {
        val n = piles.length
        val sorted = piles.sorted.reverse.take(2 * (n / 3))
        var coins = 0
        
        for(i <- 1 until sorted.length by 2) {
            coins += sorted(i)
        }
        
        coins
    }
}
