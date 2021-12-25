object Solution {
    def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
        var m = scala.collection.mutable.Map[Int, Int]().withDefaultValue(0)
        for(i <- nums) {
            m(i) += 1
        }
        
       
        (1 to nums.length).foldLeft(List[Int]())((res, n) => {
            if (m(n) == 0) res :+ n
            else res
        })
    }
}
object Solution {
    def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
        val dist = (1 until nums.length + 1)
        (dist.toSet -- nums.toSet).toList
    }
}
