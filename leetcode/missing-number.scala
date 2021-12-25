object Solution {
    def missingNumber(nums: Array[Int]): Int = {
//         val sorted = nums.sorted
        
//         for(i <- 0 until sorted.length)
//             if(sorted(i) != i) return i
        
//         sorted.length
        
        // All numbers are distinct and within range of the length so their sum and the sum of the array's difference is the missing number in the sequence
        val n = nums.length
        return ((n + 1) * n / 2) - nums.sum
    }
}
