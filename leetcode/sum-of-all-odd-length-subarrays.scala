object Solution {
    def sumOddLengthSubarrays(arr: Array[Int]): Int = {
        var sum = 0
        
        for(i <- 0 until arr.length) {
            sum += ((i + 1) * (arr.length - i) + 1) / 2 * arr(i)
        }
        
        sum
    }
}
