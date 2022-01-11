object Solution {
    def judgeCircle(moves: String): Boolean = {
        var H = 0
        var V = 0
        
        moves.foreach(
            _ match {
                case 'R' => H += 1
                case 'L' => H -= 1
                case 'U' => V += 1
                case 'D' => V -= 1
                case  _  => None
            }
        )
        
        H == 0 && V == 0
    }
}
