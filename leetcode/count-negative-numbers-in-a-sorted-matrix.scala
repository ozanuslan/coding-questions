object Solution {
    def countNegatives(grid: Array[Array[Int]]): Int = {
        // O(m*n) T
//         val n = grid.length; val m = grid(0).length
//         var cnt = 0
        
//         for(i <- n - 1 to 0 by -1) {
//             for(j <- m - 1 to 0 by -1; if(grid(i)(j) < 0)) {
//                 cnt += 1
//             }
//         }
        
//         cnt
        
        
        /*
        Sorted matrix looks like:
        ++++-
        +++--
        ++---
        +----
        By staircase logic we can assume when we
        find a top of a column that is negative
        rest of the column is negative as well
        */
        // O(m+n)
        val n = grid.length; val m = grid(0).length
        var j = m - 1; var i = 0
        var cnt = 0
        
        while(i < n && j >= 0) {
            if(grid(i)(j) < 0) {
                cnt += n - i
                j -= 1
            } else {
                i += 1
            }
        }
        
        cnt
    }
}
