object Solution {
    def peakIndexInMountainArray(arr: Array[Int]): Int = {
        for(i <- 0 until arr.length - 1) {
          if(arr(i) > arr(i + 1)) return i  
        }
        -1
    }
}
object Solution {
    def peakIndexInMountainArray(arr: Array[Int]): Int = {
        var idx = 0
        
        while(arr(idx) < arr(idx + 1)) {
            idx += 1
        }
        
        idx
    }
}
object Solution {
    def peakIndexInMountainArray(arr: Array[Int]): Int = {
        // O(n) time O(1) space, linear search
//         var idx = 0
        
//         while(arr(idx) < arr(idx + 1)) {
//             idx += 1
//         }
        
//         idx
        
        // O(logn) time O(1) space, binary search
        val n = arr.length
        var low = 0; var high = n - 1
        
        while(low < high) {
            val mid = (low + high) // 2
            if(arr(mid - 1) < arr(mid) && arr(mid) > arr(mid + 1))
                return mid
            if(arr(mid - 1) < arr(mid))
                low = mid + 1
            else
                high = mid - 1
        }
        
        -1
    }
}C
