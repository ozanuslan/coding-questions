object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        /*
        Bitwise XORing two numbers will make the result 0 if 
        the two numbers are the same, meaning the number
        that is not duplicated will remain at the end of
        the XORing process
        */
        nums.foldLeft(0) {(a, n) => a ^ n}
    }
}
