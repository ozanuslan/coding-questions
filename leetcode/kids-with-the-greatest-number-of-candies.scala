object Solution {
    def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] = {
        val maxElem = candies.max
        var l = List[Boolean]()
        
        for(n <- candies) {
            if((n + extraCandies) >= maxElem) l = true :: l
            else l = false :: l
        }
        
        l.reverse
    }
}
