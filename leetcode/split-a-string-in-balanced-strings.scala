object Solution {
    def balancedStringSplit(s: String): Int = {
        var stack = 0
        var balancedCount = 0
        
        s.foreach(c => {
            if(c == 'R') stack += 1
            else stack -= 1
            if(stack == 0) balancedCount += 1
        })
        
        balancedCount
    }
}
