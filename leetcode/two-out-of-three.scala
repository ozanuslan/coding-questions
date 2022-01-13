object Solution {
    def twoOutOfThree(nums1: Array[Int], nums2: Array[Int], nums3: Array[Int]): List[Int] = {
        var m = Array.ofDim[Int](3, 101) 
        
        for(n <- nums1) m(0)(n) = 1
        for(n <- nums2) m(1)(n) = 1
        for(n <- nums3) m(2)(n) = 1
        
        var l = List[Int]()
        for(i <- 0 until m(0).length) {
            if(m(0)(i) + m(1)(i) + m(2)(i) > 1) l = i :: l   
        }
        
        l
    }
}
