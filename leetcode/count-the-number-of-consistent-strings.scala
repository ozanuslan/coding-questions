object Solution {
    def countConsistentStrings(allowed: String, words: Array[String]): Int = {
        var count = 0
        val regex = s"[$allowed]+".r
        
        words.foreach(w => {
            if(regex.matches(w)) count += 1
        })
        
        count
    }
}
