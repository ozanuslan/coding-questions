class NumArray(_nums: Array[Int]) {

    def sumRange(left: Int, right: Int): Int = {
        var sum = 0
        for(i <- left until right + 1) {
            sum += _nums(i)
        }
        sum
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = new NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */
