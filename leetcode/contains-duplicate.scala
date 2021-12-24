object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        nums.distinct.length < nums.length
    }
}
