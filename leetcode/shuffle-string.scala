object Solution {
    def restoreString(s: String, indices: Array[Int]): String = {
        val n = s.length
        var res = new Array[Char](n)
        
        for(i <- 0 until n) {
            res(indices(i)) = s(i)
        }
        
        res.mkString("")
    }
}
