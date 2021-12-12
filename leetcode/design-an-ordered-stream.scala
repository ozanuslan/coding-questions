class OrderedStream(_n: Int) {
    
    var a = new Array[String](_n)
    var ptr = 0
    
    def insert(idKey: Int, value: String): List[String] = {
        a(idKey-1) = value

        var l = List[String]()
        
        while (ptr < a.length && a(ptr) != null) {
            l = l :+ a(ptr)
            ptr+=1;
        }
        
        l
    }

}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * var obj = new OrderedStream(n)
 * var param_1 = obj.insert(idKey,value)
 */
