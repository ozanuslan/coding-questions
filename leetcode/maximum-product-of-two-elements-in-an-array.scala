object Solution {
    def maxProduct(nums: Array[Int]): Int = {
        var max1 = nums(0) min nums(1)
        var max2 = nums(0) max nums(1)
        var maxProduct = (max1 - 1) * (max2 - 1)
        
        for(i <- 2 until nums.length) {
            if(nums(i) > max2) {
                max1 = max2
                max2 = nums(i)
            } else if (nums(i) > max1) {
                max1 = nums(i)
            }
            
            maxProduct = maxProduct max ((max1 - 1) * (max2 - 1))
        }
        
        maxProduct
    }
}
