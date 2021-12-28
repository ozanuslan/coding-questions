object Solution {
    def backspaceCompare(s: String, t: String): Boolean = {
        def cleanString(str: String): String = {
            val st = scala.collection.mutable.Stack[Char]()
            
            str.foreach(c => {
                if(c != '#') st.push(c)
                else if(!st.isEmpty) st.pop
            })
            
            st.reverse.mkString("")
        }
        
        cleanString(s) == cleanString(t)
    }
}
