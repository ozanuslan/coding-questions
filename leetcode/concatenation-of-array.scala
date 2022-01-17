object Solution {
    def getConcatenation(nums: Array[Int]): Array[Int] = {
        val n = nums.length
        var ans = new Array[Int](n * 2)
        
        for(i <- 0 until n) {
            ans(i) = nums(i)
            ans(n + i) = nums(i)
        }
        
        ans
    }
}
