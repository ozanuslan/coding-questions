object Solution {
    def construct2DArray(original: Array[Int], m: Int, n: Int): Array[Array[Int]] = {
        if(m*n != original.length) Array.empty
        else {
            var arr = Array.ofDim[Int](m, n)
            
            for(i <- 0 until m) {
                for(j <- 0 until n) {
                    arr(i)(j) = original(i * n + j)
                }
            }
            
            arr
        }
    }
}
