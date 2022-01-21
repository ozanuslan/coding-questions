object Solution {
    def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
        import scala.collection.mutable.ListBuffer
        
        def backtrack(res: ListBuffer[List[Int]], track: ListBuffer[Int], remain: Int, idx: Int): ListBuffer[List[Int]] = {
        if(remain < 0) res
        else if(remain == 0) track.clone.toList +=: res
        else {
                for(i <- idx until candidates.length) {
                    track.prepend(candidates(i))
                    backtrack(res, track, remain - candidates(i), i)
                    track.remove(0)
                }
            
                res
            }
        }
        
        backtrack(ListBuffer[List[Int]](), ListBuffer[Int](), target, 0).toList
    } 
}
