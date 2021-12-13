object Solution {
    def arrayStringsAreEqual(word1: Array[String], word2: Array[String]): Boolean = {
        val w1 = word1.foldLeft()(_ + _)
        val w2 = word2.foldLeft()(_ + _)
        w1 equals w2
    }
}
