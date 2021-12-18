object Solution {
    // Unoptimized but readable solution
    def countGoodTriplets(arr: Array[Int], a: Int, b: Int, c: Int): Int = {
        var goodCnt = 0
        
        for(i <- 0 until arr.length) {
            for(j <- i + 1 until arr.length) {
                for(k <- j + 1 until arr.length) {
                    if(good(arr(i), arr(j), arr(k), a, b, c)) goodCnt += 1
                }
            }
        }
        
        goodCnt
    }
    
    def good(n1: Int, n2: Int, n3: Int, a: Int, b: Int, c: Int): Boolean = {
        (n1 - n2).abs <= a && (n2 - n3).abs <= b && (n1 - n3).abs <= c
    }
}
