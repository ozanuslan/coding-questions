object Solution {
    def minCostToMoveChips(position: Array[Int]): Int = {
        /*
        [2,2,3,3,3] <- 2 even 3 odds
        [2,2,2,3,3] <- 3 even 2 odds
        Cost of moving pieces to the same index is 
        only dependent on how many pieces must be
        moved by 1 position, meaning, how many
        odd numbers should become even and vice
        versa. So, counting the number of odd
        and even numbers then selecting the
        minimum of both counts will give us
        the minimum cost of moving the pieces.
        */
        
        var odd, even = 0
        
        for(p <- position) {
            if(p % 2 == 0) even += 1
            else odd += 1
        }
        
        odd min even
    }
}
