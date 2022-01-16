object Solution {
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        val n = nums.length
        var arr = new Array[Int](n)
        arr(0) = 1
        
        // First calculate left products
        for(i <- 1 until n) arr(i) = arr(i - 1) * nums(i - 1)
        
        // Then calculate right product one step at a time
        /*
        arr = [1, 2, 6, 24]
        rightProduct = {24, 24, 12, 4, 1}
        because the rightProduct is calculated after the fact
        we can successfully calculate the elements
        */
        var rightProduct = 1
        for(i <- n - 1 to 0 by -1) {
            arr(i) *= rightProduct
            rightProduct *= nums(i)
        }
        
        arr
    }
}
