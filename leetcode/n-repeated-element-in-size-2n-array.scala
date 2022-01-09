object Solution {
    def repeatedNTimes(nums: Array[Int]): Int = {
        // O(n) time O(n) space
        // var map = Map[Int, Int]()
        // for(n <- nums) {
        //     if(!map.contains(n)) map += (n -> 1)
        //     else return n
        // }
        // nums(0)
        
        // O(n) time O(1) space
        for(i <- 2 until nums.length) {
            if(nums(i) == nums(i - 1) || nums(i) == nums(i - 2)) return nums(i)
        }
        nums(0)
    }
}
