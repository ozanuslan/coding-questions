object Solution {
    def diagonalSum(mat: Array[Array[Int]]): Int = {
        val n = mat.length
        var cnt = 0
        
        for(i <- 0 until n) {
            for(j <- 0 until n) {
                if (i == j) cnt += mat(i)(j)
                else if (i == n - 1 - j) cnt += mat(i)(j)
            }
        }
        
        cnt
    }
}
