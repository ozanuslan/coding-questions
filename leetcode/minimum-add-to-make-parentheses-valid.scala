object Solution {
    def minAddToMakeValid(s: String): Int = {
        // Grammar
        // A -> ε | AA | (A)
        var opening = 0
        var closing = 0
        
        s.foreach(c => {
            if(c == '(') {
                closing += 1
            } else if (closing > 0) {
                closing -= 1
            } else {
                opening += 1
            }
        })
        
        opening + closing
    }
}
