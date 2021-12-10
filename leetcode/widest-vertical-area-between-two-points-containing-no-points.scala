object Solution {
    def maxWidthOfVerticalArea(points: Array[Array[Int]]): Int = {
        var maxDiff = 0
        val arr = points.sortWith(_(0) < _(0))
        for(i <- 0 until arr.length - 1){
            maxDiff = (arr(i+1)(0) - arr(i)(0)) max maxDiff
        }
        maxDiff
    }
}
