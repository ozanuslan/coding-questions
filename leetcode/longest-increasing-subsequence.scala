object Solution {
    def lengthOfLIS(nums: Array[Int]): Int = {
        var subArr = new Array[Int](nums.length)
        var length = 0
        
        for(n <- nums) {
            var lo = 0; var hi = length
            while(lo < hi) {
                val m = (lo + hi) / 2
                if(subArr(m) < n) lo = m + 1
                else hi = m
            }
            subArr(lo) = n
            if(lo == length) length += 1
        }
        
        length
    }
}
