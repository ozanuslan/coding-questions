object Solution {
    def oddCells(m: Int, n: Int, indices: Array[Array[Int]]): Int = {
        var rows = new Array[Int](m)
        var cols = new Array[Int](n)
        
        for(i <- 0 until indices.length) {
            rows(indices(i)(0)) += 1
            cols(indices(i)(1)) += 1
        }
        
        var oddCnt = 0
        
        for(i <- 0 until m)
            for(j <- 0 until n)
                if((rows(i) + cols(j)) % 2 == 1) oddCnt += 1
        
        oddCnt
    }
}
