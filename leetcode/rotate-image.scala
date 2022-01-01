object Solution {
    def rotate(matrix: Array[Array[Int]]): Unit = {
        // Transposing the arrat first, then flipping it horizontally is the same with
        // rotating the array by 90 degrees clockwise
        // if we flipped it vertically then it would be the same as rotating counter clockwise
        var temp = 0
        for(i <- 0 until matrix.length) {
            for(j <- i until matrix(0).length) {
                temp = matrix(i)(j)
                matrix(i)(j) = matrix(j)(i)
                matrix(j)(i) = temp
            }
        }
        
        for(i <- 0 until matrix.length) {
            for(j <- 0 until matrix(0).length / 2) {
                temp = matrix(i)(j)
                matrix(i)(j) = matrix(i)(matrix(0).length - 1 - j)
                matrix(i)(matrix(0).length - 1 - j) = temp
            }
        }
    }
}
