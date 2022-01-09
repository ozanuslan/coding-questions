object Solution {
    def minSteps(s: String, t: String): Int = {
        var arr = new Array[Int](26)
        
        for(c <- s) arr(c - 'a') += 1
        for(c <- t) if(arr(c - 'a') > 0) arr(c - 'a') -= 1
        
        arr.sum
    }
}
