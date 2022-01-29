object Solution {
    def countWords(words1: Array[String], words2: Array[String]): Int = {
        val map = scala.collection.mutable.Map[String, Int]()
        
        words1 foreach {w => map.get(w) match {
            case Some(v)  => map.update(w, v + 1)
            case None     => map += (w -> 1)
        }}
        
        words2 foreach {w => map.get(w) match {
            case Some(v)  => if(v < 2) map.update(w, v - 1) else None
            case None     => None
        }}
        
        map.values.foldLeft(0)((acc, v) => if(v == 0) acc + 1 else acc)
    }
}
