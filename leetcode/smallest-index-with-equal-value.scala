object Solution {
    def smallestEqual(nums: Array[Int]): Int = {
        for(i <- 0 until nums.length) {
            if(i % 10 == nums(i)) return i
        }
        
        -1
    }
}
