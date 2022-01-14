object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        // Optimized solution, @leetchunchui has a great explanation
        var n1 = m - 1
        var n2 = n - 1
        var idx = m + n - 1
        
        while(n1 >= 0 && n2 >= 0) {
            if(nums1(n1) > nums2(n2)) {
                nums1(idx) = nums1(n1)
                n1 -= 1
            } else {
                nums1(idx) = nums2(n2)
                n2 -= 1
            }
            idx -= 1
        }
        
        while(n2 >= 0) {
            nums1(idx) = nums2(n2)
            n2 -= 1
            idx -= 1
        }
    }
}
