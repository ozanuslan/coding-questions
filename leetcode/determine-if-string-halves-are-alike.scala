object Solution {
    def halvesAreAlike(s: String): Boolean = {
        val chars = List[Char]('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var cnt = 0
        
        for(i <- 0 until s.length) {
            if(chars.contains(s(i))) {
                if(i < s.length / 2) cnt += 1
                else cnt -= 1
            }
        }
        
        cnt == 0
    }
}
