object Solution {
    def isPalindrome(x: Int): Boolean = {
        val str = x.toString
        var lPtr = 0
        var rPtr = str.length - 1
        for(i <- 0 until str.length / 2) {
            if(str(lPtr) != str(rPtr)) return false
            lPtr += 1
            rPtr -= 1
        }
        
        true
    }
}
