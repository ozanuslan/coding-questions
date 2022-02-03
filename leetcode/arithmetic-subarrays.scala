object Solution {
    def checkArithmeticSubarrays(nums: Array[Int], l: Array[Int], r: Array[Int]): List[Boolean] = {
        (l zip r).foldLeft(List[Boolean]())((acc, i) => isArithmetic(nums, i._1, i._2) :: acc).reverse
    }
    
    def isArithmetic(arr: Array[Int], left: Int, right: Int): Boolean = {
        if((right - left) < 2) return true // Subarray is always arithmetic if len <= 2
        
        val set = scala.collection.mutable.Set[Int]() // Set to save nums encountered
        var minVal = Int.MaxValue; var maxVal = Int.MinValue // Min and max values of the interval
        for(i <- left to right) {
            minVal = minVal min arr(i)
            maxVal = maxVal max arr(i)
            set += arr(i)
        }
        
        // If the default diff between numbers cannot be divided without a remainder it cannot have be arithmetic
        if((maxVal - minVal) % (right - left) != 0) return false 
        
        val defaultDiff = (maxVal - minVal) / (right - left) // Default difference between numbers in sequence
        for(i <- 1 to (right - left)) {
            // If we have not recorded a number that should be in the sequence, it is not arithmetic
            if(!set.contains(minVal + (i * defaultDiff))) return false
        }
        
        true
    }
}
