object Solution {
    def finalValueAfterOperations(operations: Array[String]): Int = {
        operations.foldLeft(0)((acc, op) => if(op.contains("+")) acc + 1 else acc - 1)
    }
}
