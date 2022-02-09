object Solution {
    def subsets(nums: Array[Int]): List[List[Int]] = {
        var solution = List[List[Int]]()
        
        def backtrack(subSolution: List[Int], startIdx: Int) {
            val subRef = subSolution
            solution = subRef :: solution
            for(i <- startIdx until nums.length) {
                backtrack(nums(i) :: subRef, i + 1)
            }
        }
        
        backtrack(List[Int](), 0)
        
        solution
    }
}
