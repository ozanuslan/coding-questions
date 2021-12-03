object Solution {
    def maxSubArray(nums: Array[Int]): Int = {
        var maxSum = nums(0)
        var sum = 0
        nums.foreach(n => {
            sum += n
            maxSum = maxSum max sum
            if(sum < 0) sum = 0
        })
        maxSum
    }
}