object Solution {
    def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {       
        val mem = scala.collection.mutable.Map[Int, Int]()
        var sorted = nums.sorted
        // nums   = [8,1,2,2,3]
        // sorted = [1,2,2,3,8]
        for(i <- 0 until sorted.length) {
            mem.getOrElseUpdate(sorted(i), i)
        }
        // mem = {(1 -> 0), (2 -> 1), (3 -> 3), (8 -> 4)}
        for(i <- 0 until sorted.length) {
            sorted(i) = mem(nums(i))
        }
        // sorted = [4,0,1,1,3]
        sorted
    }
}
