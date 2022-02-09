object Solution {
    def subsetsWithDup(nums: Array[Int]): List[List[Int]] = {
        var solution = List[List[Int]]()
        val sorted = nums.sorted
        
        def backtrack(subSolution: List[Int], startIdx: Int) {
            val ref = subSolution
            solution = ref :: solution
            
            for(i <- startIdx until nums.length){
                if(i <= startIdx || sorted(i) != sorted(i - 1))
                    backtrack(sorted(i) :: ref, i + 1)
            }
        }
        
        backtrack(List[Int](), 0)
        
        solution
    }
}C
