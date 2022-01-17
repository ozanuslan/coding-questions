object Solution {
    def runningSum(nums: Array[Int]): Array[Int] = {
        var sum = 0
        nums.map(n => {sum+=n; sum})
    }
}
object Solution {
    def runningSum(nums: Array[Int]): Array[Int] = {
        var run = 0
        val n = nums.length
        var ans = new Array[Int](n)
        
        for(i <- 0 until n) {
            run += nums(i)
            ans(i) = run
        }
        
        ans
    }
}C
