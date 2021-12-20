object Solution {
    def minOperations(nums: Array[Int]): Int = {
        var maxSoFar = 0
        var ops = 0
        
        nums.foreach(n => {
            if(n > maxSoFar) maxSoFar = n
            else {
                maxSoFar += 1
                ops += maxSoFar - n
            }
        })
        
        ops
    }
}
