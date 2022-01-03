object Solution {
    def maximumProduct(nums: Array[Int]): Int = {
        /*
        Not pretty but best time and space solution
        (probably)
        */
        var max1, max2, max3 = Int.MinValue
        var min1, min2 = Int.MaxValue
        
        for(num <- nums) {
            if(num > max1) {
                max3 = max2
                max2 = max1
                max1 = num
            } else if(num > max2) {
                max3 = max2
                max2 = num
            } else if(num > max3) {
                max3 = num
            }
            
            if(num < min1) {
                min2 = min1
                min1 = num
            } else if(num < min2) {
                min2 = num
            }
        }
        
        max1 * max2 * max3 max max1 * min1 * min2
    }
}
