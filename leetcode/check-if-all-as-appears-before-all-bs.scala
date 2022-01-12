object Solution {
    def checkString(s: String): Boolean = {
        var encounteredB = false
        
        for(c <- s) {
            if(c == 'b') encounteredB = true
            if(encounteredB && c == 'a') return false
        }
        
        true
    }
}
