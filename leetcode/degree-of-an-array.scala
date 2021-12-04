import scala.collection.mutable.Map

object Solution {
    type Num = Int
    case class NumStats(num: Num, var occurances: Int, startIndex: Int, var endIndex: Int)
    def findShortestSubArray(nums: Array[Int]): Int = {
        val statMap = Map[Num, NumStats]()
        
        for(i <- 0 until nums.length) {
            val n = nums(i)
            if(statMap.contains(n)){
              statMap(n).occurances += 1
              statMap(n).endIndex = i  
            } else {
              statMap(n) = NumStats(n, 1, i, i)
            }
        }

        var minStats = statMap.values.head
        statMap.values.foreach(ns => {
            if(ns.occurances > minStats.occurances) {
                minStats = ns
            } else if(ns.occurances == minStats.occurances) {
                if(ns.endIndex - ns.startIndex < minStats.endIndex - minStats.startIndex) {
                    minStats = ns
                }
              }
        })
        minStats.endIndex - minStats.startIndex + 1
    }
}