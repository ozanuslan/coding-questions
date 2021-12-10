object Solution {
    def xorOperation(n: Int, start: Int): Int = {
        var nums = new Array[Int](n)
        for(i <- 0 until n){
            nums(i) = start + 2 * i
        }
        
        nums.foldLeft(0)(_ ^ _)
    }
}
