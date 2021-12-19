object Solution {
    def numOfStrings(patterns: Array[String], word: String): Int = {
        var cnt = 0
        
        patterns.foreach(str => {
            if(word.indexOf(str) > -1) cnt += 1
        })
        
        cnt
    }
}
