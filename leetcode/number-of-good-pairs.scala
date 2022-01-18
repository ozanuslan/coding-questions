object Solution {
    def numIdenticalPairs(nums: Array[Int]): Int = {
        var mem = new Array[Int](101)
        var res = 0
        
        for(n <- nums) {
            res += mem(n)
            mem(n) += 1
        }
        
        res
    }
}
