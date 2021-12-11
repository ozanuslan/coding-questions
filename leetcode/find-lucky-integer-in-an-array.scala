object Solution {
    def findLucky(arr: Array[Int]): Int = {
        var lucky = (-1 -> -1)
        var mem = scala.collection.mutable.Map[Int, Int]()
        
        arr.foreach(n => {
            if(mem.contains(n)) mem(n) += 1
            else mem(n) = 1
        })
        
        lucky = mem.toSeq.filter(c => c._1 == c._2).sortWith(_._1 > _._1).headOption getOrElse (-1 -> -1)
        
        lucky._1
    }
}
