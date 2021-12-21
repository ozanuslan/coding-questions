object Solution {
    def findNumbers(nums: Array[Int]): Int = {
        nums.foldLeft(0)((acc, n) => {
            if(n.toString.length % 2 == 0) acc + 1
            else acc
        })
    }
}
