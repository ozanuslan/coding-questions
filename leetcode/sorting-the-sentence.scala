object Solution {
    def sortSentence(s: String): String = {
        s.split( ).map(w => (w.takeRight(1).toInt -> w.dropRight(1))).sortWith(_._1 < _._1).map(_._2).mkString( )
    }
}
