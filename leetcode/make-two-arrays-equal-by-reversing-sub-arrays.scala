object Solution {
    def canBeEqual(target: Array[Int], arr: Array[Int]): Boolean = {
        val m = scala.collection.mutable.Map[Int, Int]()
        
        for(n <- arr) {
            m.get(n) match {
                case Some(v) => m.update(n, v + 1)
                case None    => m += (n -> 1)
            }
        }
        
        for(n <- target) {
            m.get(n) match {
                case Some(v) => if(v == 0) return false else m.update(n, v - 1)
                case None    => return false
            }
        }
        
        true
    }
}
