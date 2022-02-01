object Solution {
    def sortArrayByParityII(nums: Array[Int]): Array[Int] = {
        // Two pointers to swap non-sorted elements
        // O(n) time O(1) space (In place sorting)
        val n = nums.length
        var even = 0; var odd = n - 1
        
        while(even < n && odd >= 0) {
            if(nums(even) % 2 == 0) even += 2
            else if(nums(odd) % 2 == 1) odd -= 2
            else swap(even, odd)
        }
        
        def swap(idx1: Int, idx2: Int) {
            val temp = nums(idx1)
            nums(idx1) = nums(idx2)
            nums(idx2) = temp
        }
        
        nums
    }
}
