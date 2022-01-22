object Solution {
    def combine(n: Int, k: Int): List[List[Int]] = {
        var res = List[List[Int]]()
        
        import scala.collection.mutable.ListBuffer
        def backtrack(combination: ListBuffer[Int], remain: Int, next: Int) {
           if(remain == 0) {
               res = combination.toList :: res
           } else {
               for(i <- next to n) {
                   combination.prepend(i)
                   backtrack(combination, remain - 1, i + 1)
                   combination.remove(0)
               }
           }
        }
        
        backtrack(ListBuffer[Int](), k, 1)
        
        res
    }
}
