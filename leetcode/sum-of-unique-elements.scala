object Solution {
    def sumOfUnique(nums: Array[Int]): Int = {
        var arr = new Array[Int](101)
        
        for(n <- nums) {
            if(arr(n) == 0) arr(n) = 1
            else arr(n) = -1
        }
        
        var sum = 0
        for(i <- 0 until arr.length) {
            if(arr(i) > 0) sum += i   
        }
        sum
    }
}
