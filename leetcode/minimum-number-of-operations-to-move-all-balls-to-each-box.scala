object Solution {
  // O(n^2) time, this is bad
    def minOperations(boxes: String): Array[Int] = {
        var res = new Array[Int](boxes.length)
        for(i <- 0 until boxes.length) {
          for(j <- 0 until boxes.length){
            if(boxes(j) == '1') res(i) += Math.abs(i-j)
          }
        }
        res
    }
}