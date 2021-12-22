object Solution {
    def areOccurrencesEqual(s: String): Boolean = {
        var chars = new Array[Int](26)
        s.foreach(c => chars(c - 'a') += 1)
        val k = chars.filter(_ != 0)
        k.forall(_ == k.head)
    }
}
