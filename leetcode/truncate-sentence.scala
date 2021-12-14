object Solution {
    def truncateSentence(s: String, k: Int): String = {
        var spaceCnt = 0
        var newString = ""
        
        for(i <- 0 until s.length; if spaceCnt < k){
            if(s(i) == ' ') spaceCnt += 1
            if(spaceCnt < k) newString = newString + s(i).toString
        }
        
        newString.trim
        // s.split(" ").take(k).mkString(" ") // <- simpler solution
    }
}
