object Solution {
    def findCenter(edges: Array[Array[Int]]): Int = {
        var mem = scala.collection.mutable.Map[Int, Int]()
        
        edges.foreach(_.foreach(v => {
            if(mem.contains(v)) mem(v) += 1
            else mem(v) = 1
        }))
        
        mem.toSeq.sortWith(_._2 > _._2).head._1
    }
}
