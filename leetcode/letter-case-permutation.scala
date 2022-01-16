object Solution {
    def letterCasePermutation(s: String): List[String] = {
        /*
        Approach here can be realized by creating
        each permutation step by step in an orderly manner
        Each step will represent a level in a tree
        0        a1b2
        1    a1b2    A1b2
        2 a1b2 A1b2 a1B2 A1B2
        Depth = letter count + 1 (original string) (e.g. a1b2 -> 2 letters + 1 = 3)
        */
        
        // BFS implementation
        var q = scala.collection.mutable.Queue[String](s)

        for(i <- 0 until s.length) {
            if(!s(i).isDigit) {
            val size = q.knownSize
                for(j <- 0 until size) {
                    var chArr = q.dequeue.toCharArray

                    chArr(i) = chArr(i).toUpper
                    q.enqueue(chArr.mkString(""))

                    chArr(i) = chArr(i).toLower
                    q.enqueue(chArr.mkString(""))
                }
            }
        }

        q.toList
    }
}
