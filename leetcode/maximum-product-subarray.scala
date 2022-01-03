object Solution {
    def maxProduct(nums: Array[Int]): Int = {
        val len = nums.length
        
        var leftProduct, rightProduct = 1
        var ans = Int.MinValue
        
        for(i <- 0 until len) {
            leftProduct = if(leftProduct == 0) 1 else leftProduct
            rightProduct = if(rightProduct == 0) 1 else rightProduct
            
            leftProduct *= nums(i)
            rightProduct *= nums(len - 1 - i)
            
            ans = ans max (leftProduct max rightProduct)
        }
        
        ans
    }
}
