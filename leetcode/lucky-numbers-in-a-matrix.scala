object Solution {
    def luckyNumbers (matrix: Array[Array[Int]]): List[Int] = {
        val rowMins = matrix.map(_.min)
        val colMaxs = matrix.transpose.map(_.max)
        (rowMins intersect colMaxs).toList
    }
}
