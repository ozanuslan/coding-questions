object Solution {
    def shuffle(nums: Array[Int], n: Int): Array[Int] = {
        var res = new Array[Int](2 * n)
        for(i <- 0 until n) {
            res(i * 2) = nums(i)
            res(i * 2 + 1) = nums(i + n)
        }
        res
    }
}
