object Solution {
    def sumZero(n: Int): Array[Int] = {
        if(n == 1) Array(0)
        else {
            var arr = new Array[Int](n)
            if(n % 2 == 0){
                var j = 0
               for(i <- -(n/2) until (n/2) + 1){
                   if(i != 0){
                        arr(j) = i
                       j += 1
                   }  
               }
            } else {
                for(i <- -((n-1)/2) until ((n-1)/2) + 1)
                    arr(i + (n-1)/2) = i
            }
            arr
        }
    }
}
