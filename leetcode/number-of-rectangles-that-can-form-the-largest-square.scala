object Solution {
    def countGoodRectangles(rectangles: Array[Array[Int]]): Int = {
        var maxLen = 0
        var maxCnt = 0
        
        rectangles.foreach(r => {
            val sqrSide = r(0) min r(1)
            if(maxLen < sqrSide) {
                maxLen = sqrSide
                maxCnt = 1
            } else if (maxLen == sqrSide) maxCnt += 1
        })
        
        maxCnt 
    }
}
