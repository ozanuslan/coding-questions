object Solution {
    def createTargetArray(nums: Array[Int], index: Array[Int]): Array[Int] = {
        var target = new Array[Int](nums.length).map(_ => -1)
        for(i <- 0 until nums.length) {
          if(target(index(i)) == -1) 
            target(index(i)) = nums(i)
          else {
            pushRight(target, index(i))
            target(index(i)) = nums(i)
          }
        }
        target.map(x => if(x == -1) 0 else x)
    }

    def pushRight(target: Array[Int], index: Int): Unit = {
      for(i <- target.length - 1 to index by -1) {
        if(i > 0) target(i) = target(i - 1)
      }
    }
}