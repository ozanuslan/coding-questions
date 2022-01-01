object Solution {
    type Index = Int
    type Coord = Tuple2[Index, Index]
    
    def setZeroes(matrix: Array[Array[Int]]): Unit = {
        // O(m + n) space, only the number of zeroes matter
//         var zeroCoords = List[Coord]()
        
//         for(i <- 0 until matrix.length) {
//             for(j <- 0 until matrix(0).length) {
//                 if(matrix(i)(j) == 0) zeroCoords = (i, j) :: zeroCoords
//             }
//         }
        
//         zeroCoords.foreach(setZeroesWithCoord(matrix, _))
        
        // O(1) space, using first col and row as memory and keeping their zero state as booleans
        var firstRowHasZero, firstColHasZero = false
        
        for(i <- 0 until matrix(0).length) {
            if(matrix(0)(i) == 0) firstRowHasZero = true
        }
        for(i <- 0 until matrix.length) {
            if(matrix(i)(0) == 0) firstColHasZero = true
        }
        
        for(i <- 1 until matrix.length) {
            for(j <- 1 until matrix(0).length) {
                if(matrix(i)(j) == 0) {
                    matrix(0)(j) = 0
                    matrix(i)(0) = 0
                }
            }
        }
        
        for(i <- 1 until matrix.length) {
            if(matrix(i)(0) == 0) {
                for(j <- 0 until matrix(0).length) matrix(i)(j) = 0
            }
        }
        for(i <- 1 until matrix(0).length) {
            if(matrix(0)(i) == 0) {
                for(j <- 0 until matrix.length) matrix(j)(i) = 0
            }
        }
        
        if(firstRowHasZero) {
            for(i <- 0 until matrix(0).length) matrix(0)(i) = 0
        }
        if(firstColHasZero) {
            for(i <- 0 until matrix.length) matrix(i)(0) = 0
        }
    }
    
    // def setZeroesWithCoord(matrix: Array[Array[Int]], c: Coord) {
    //     for(i <- 0 until matrix.length) {
    //         matrix(i)(c._2) = 0    
    //     }
    //     for(i <- 0 until matrix(0).length) {
    //         matrix(c._1)(i) = 0    
    //     }
    // }
}
