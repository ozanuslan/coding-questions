object Solution {
    def maxProductDifference(nums: Array[Int]): Int = {
        val s = nums.sortWith(_ > _)
        val big = s.take(2)
        val small = s.takeRight(2)
        (big(0) * big(1)) - (small(0) * small(1))
    }
}
