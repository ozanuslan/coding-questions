object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        var mem = scala.collection.mutable.Map[Int, Int]()
        
        for(i <- 0 until nums.length) {
            val remainder = target - nums(i)
            if(mem.contains(remainder)) {
                return Array(mem(remainder), i)
            } else {
                mem(nums(i)) = i
            }
        }
        
        Array(-1, -1)
    }
}
