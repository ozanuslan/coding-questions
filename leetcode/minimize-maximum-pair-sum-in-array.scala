object Solution {
    def minPairSum(nums: Array[Int]): Int = {
        val sorted = nums.sortWith(_ < _)
        var max = 0
        
        for(i <- 0 until sorted.length / 2){
            max = max max (sorted(i) + sorted(sorted.length - 1 - i))
        }
        
        max
    }
}
