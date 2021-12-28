object Solution {
    def sortedSquares(nums: Array[Int]): Array[Int] = {
        nums.map(Math.pow(_, 2).toInt).sorted
    }
}
