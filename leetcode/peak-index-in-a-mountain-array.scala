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
