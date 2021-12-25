object Solution {
    def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
        // O(n^2) solution
        // for(i <- 0 until nums.length) {
        //     for(j <- (i+1) until nums.length) {
        //         if(nums(i) == nums(j) && (i - j).abs <= k) return true
        //     }
        // }
        // false
        
        // O(n) time
        // O(n) space
        var mem = scala.collection.mutable.Map[Int, Int]()
        for(i <- 0 until nums.length) {
            if(mem.contains(nums(i))) {
                if((mem(nums(i)) - i).abs <= k) return true
                else mem(nums(i)) = i
            } else {
                mem(nums(i)) = i
            }
        }
        false
    }
}
