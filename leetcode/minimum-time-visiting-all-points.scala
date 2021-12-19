object Solution {
    def minTimeToVisitAllPoints(points: Array[Array[Int]]): Int = {
        var sum = 0
        for(i <- 0 until points.length - 1){
            val p1 = points(i)
            val p2 = points(i+1)
            sum += (p1(0) - p2(0)).abs max (p1(1) - p2(1)).abs
        }
        sum
    }
}
