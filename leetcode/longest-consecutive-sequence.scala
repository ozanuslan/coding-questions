object Solution {
    def longestConsecutive(nums: Array[Int]): Int = {
        val set = nums.toSet
        
        var longest = 0
        
        for(n <- nums) {
            if(!set(n - 1)) {
                var t = n + 1
                while(set(t)) {t += 1}
                longest = longest max t - n
            }
        }
        
        longest
    }
}
