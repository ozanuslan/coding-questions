object Solution {
    def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
        var l = List[Int]()
        
        val n = matrix.length
        val m = matrix(0).length
        
        var left, up = 0
        var down = n - 1
        var right = m - 1
        
        while(l.size < m * n) {
            for(i <- left to right; if(l.size < m * n))
                l = matrix(up)(i) :: l
            
            for(i <- up + 1 until down; if(l.size < m * n))
                l = matrix(i)(right) :: l
            
            for(i <- right to left by -1 ; if(l.size < m * n))
                l = matrix(down)(i) :: l
            
            for(i <- down - 1 until up by -1; if(l.size < m * n))
                l = matrix(i)(left) :: l
            
            left += 1
            right -= 1
            up += 1
            down -= 1
        }
        
        l.reverse
    }
}
