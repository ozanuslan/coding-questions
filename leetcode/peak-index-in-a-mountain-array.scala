object Solution {
    def peakIndexInMountainArray(arr: Array[Int]): Int = {
        for(i <- 0 until arr.length - 1) {
          if(arr(i) > arr(i + 1)) return i  
        }
        -1
    }
}
