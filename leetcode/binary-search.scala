object Solution {
    def search(nums: Array[Int], target: Int): Int = {
        // Basic binary search
        var lo = 0; var hi = nums.length - 1;
        
        while(lo < hi) {
            val mid = lo + Math.floor((hi - lo + 1) / 2).toInt
            if(target < nums(mid)) hi = mid - 1
            else lo = mid
        }
        
        if(nums(lo) == target) lo else -1
    }
}
