object Solution {
    def minTimeToType(word: String): Int = {
        var ptr = 'a'
        var moves = word.length
        
        for(c <- word) {
            val diff = (c - ptr).abs
            val ptrMove = diff min 26 - diff
            moves += ptrMove
            ptr = c
        }
        
        moves
    }
}
