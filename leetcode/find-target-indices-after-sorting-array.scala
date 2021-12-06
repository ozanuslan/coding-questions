object Solution {
    def targetIndices(nums: Array[Int], target: Int): List[Int] = {
        val sorted = nums.sortWith(_ < _)
        var res = List[Int]()
        for(i <- 0 until sorted.length) {
          if(sorted(i) == target) res = i :: res
        }
        res.sortWith(_ < _)
    }
}