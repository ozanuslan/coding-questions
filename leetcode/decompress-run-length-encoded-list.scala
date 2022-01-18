object Solution {
    def decompressRLElist(nums: Array[Int]): Array[Int] = {
        var l = List[Int]()
        
        for(i <- 0 until nums.length by 2) {
            val freq = nums(i)
            val value = nums(i + 1)
            l = List.fill(freq)(value) ::: l
        }
        
        l.reverse.toArray
    }
}
