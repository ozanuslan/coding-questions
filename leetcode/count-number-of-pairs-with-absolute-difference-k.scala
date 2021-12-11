object Solution {
    def countKDifference(nums: Array[Int], k: Int): Int = {
        var mem = scala.collection.mutable.Map[Int,Int]()
        var count = 0
        
        for(i <- 0 until nums.length){
            val diff = nums(i) - k
            val sum = nums(i) + k
            if(mem.contains(diff)) count += mem(diff)
            if(mem.contains(sum)) count += mem(sum)
            if(mem.contains(nums(i))) mem(nums(i)) += 1
            else mem(nums(i)) = 1
        }
        
        count
    }
}
