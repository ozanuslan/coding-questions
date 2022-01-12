object Solution {
    def countSquares(matrix: Array[Array[Int]]): Int = {
        /*
        Using DP memoization, looking at your neighbours 
        came before you (according to the starting point 0,0) 
        determine how many squares you belong to.
        
        0 1    0 1
        1 1 -> 1 1 
        
        1 1    1 1
        1 1 -> 1 2< this element belongs to two squares
        */
        
        var sum = 0
        
        for(i <- 0 until matrix.length) {
            for(j <- 0 until matrix(i).length) {
                if(matrix(i)(j) == 1) {
                    // it does not make sense to look back for the first indices
                    if(i > 0 && j > 0) {
                    matrix(i)(j) = 1 + (matrix(i - 1)(j - 1) min matrix(i - 1)(j) min matrix(i)(j - 1)) // +1 to include yourself since single 1's also form squares
                }
                    
                    sum += matrix(i)(j)
                }
            }
        }
        
        sum
    }
}
