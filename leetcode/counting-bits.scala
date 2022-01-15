object Solution {
    def countBits(n: Int): Array[Int] = {
        // Don't like bit manipulation :(
        // Solution: https://leetcode.com/problems/counting-bits/discuss/270693/Intermediate-processsolution-for-the-most-voted-solution-i.e.-no-simplificationtrick-hidden
        var res = new Array[Int](n + 1)
        res(0) = 0
        
        for(i <- 1 to n) {
            if(i % 2 == 0) res(i) = res(i >> 1)
            else res(i) = res(i - 1) + 1
        }
        
        res
    }
}
