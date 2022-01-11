object Solution {
    def mergeAlternately(word1: String, word2: String): String = {
        var i = 0
        var res = ""
        
        for(a <- 0 until (word1.length min word2.length)) {
            res = res + word1(a)
            res = res + word2(a)
            i = a
        }
        
        if(word1.length > word2.length) res = res + word1.substring(i + 1)
        else if(word2.length > word1.length) res = res + word2.substring(i + 1)
        
        res
    }
}
