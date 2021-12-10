object Solution {
    def maxIncreaseKeepingSkyline(grid: Array[Array[Int]]): Int = {
        var iArr = new Array[Int](grid.length)
        var jArr = new Array[Int](grid.length)
        
        for(i <- 0 until grid.length){
            for(j <- 0 until grid(i).length){
                iArr(i) = grid(i)(j) max iArr(i)
                jArr(j) = grid(i)(j) max jArr(j)
            }
        }
        
        var sum = 0
        
        for(i <- 0 until grid.length){
            for(j <- 0 until grid(i).length){
                val minMaxDiff = (iArr(i) min jArr(j)) - grid(i)(j)
                if(minMaxDiff > 0) sum += minMaxDiff
            }
        }
        
        sum
    }
}
