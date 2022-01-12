object Solution {
    def maxSatisfaction(satisfaction: Array[Int]): Int = {  
        /*
        Sorting the array will bring group large
        values at the end of the array. We continue
        to accept overrides on result as long as
        current sum cumulating from previous sums
        is larger than our result.
        */
        
        val sorted = satisfaction.sorted
        var prevSum, currSum, res = 0
        
        for(i <- sorted.length - 1 to 0 by -1) {
            prevSum += sorted(i)
            currSum += prevSum
            res = res max currSum
        }
        
        res
    }
}
