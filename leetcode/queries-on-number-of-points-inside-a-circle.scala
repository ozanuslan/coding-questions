object Solution {
    def countPoints(points: Array[Array[Int]], queries: Array[Array[Int]]): Array[Int] = {
        val qLen = queries.length
        val res = new Array[Int](qLen)
        for(i <- 0 until qLen) {
            var count = 0
            points.foreach(p => {
                if(isPointInCircle(p, queries(i))) count += 1
            })
            res(i) = count
        }
        res   
    }

    def isPointInCircle(point: Array[Int], circle: Array[Int]): Boolean = {
        val x = point(0) - circle(0)
        val y = point(1) - circle(1)
        val r = circle(2)
        x * x + y * y <= r * r
    }
}