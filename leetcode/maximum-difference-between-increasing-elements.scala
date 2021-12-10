object Solution {
    def maximumDifference(nums: Array[Int]): Int = {
        var maxDiff = -1
        var minSoFar = nums(0)
        
        for(i <- 1 until nums.length){
            minSoFar = minSoFar.min(nums(i))
            maxDiff = maxDiff.max(nums(i) - minSoFar)
        }
        
        if(maxDiff == 0) -1 else maxDiff
    }
}
