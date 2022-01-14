object Solution {
    def sortedSquares(nums: Array[Int]): Array[Int] = {
        nums.map(Math.pow(_, 2).toInt).sorted
    }
}
object Solution {
    def sortedSquares(nums: Array[Int]): Array[Int] = {
        // O(nlogn) T O(n) S
        // nums.map(scala.math.pow(_, 2).toInt).sorted
        
        // O(n) T S
        val n = nums.length; var i = 0; var j = n - 1
        var a = new Array[Int](n)
        
        for(k <- n - 1 to 0 by -1) {
            if(nums(i).abs > nums(j).abs) {
                a(k) = nums(i) * nums(i)
                i += 1
            } else {
                a(k) = nums(j) * nums(j)
                j -= 1
            }
        }
        
        a
    }
}
