object Solution {
    def buildArray(nums: Array[Int]): Array[Int] = {
        val n = nums.length
        var ans = new Array[Int](n)
        
        for(i <- 0 until n) {
           ans(i) = nums(nums(i)) 
        }
        
        ans
    }
}
