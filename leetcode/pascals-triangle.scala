object Solution {
  def generate(numRows: Int): List[List[Int]] = {
    (0 until numRows)
      .foldLeft(List[List[Int]]())((acc, i) => {
        val newRow = goDownPascal(acc.headOption.getOrElse(List[Int]()))
        newRow :: acc
      })
      .reverse
  }  
    
  def goDownPascal(row: List[Int]): List[Int] = {
    val newLen: Int = row.length + 1
    var arr = new Array[Int](newLen)

    // Set default values of Pascal Triangle to the start and
    // end of the row
    arr(0) = 1
    arr(newLen - 1) = 1

    for (i <- 0 until row.length - 1) {
      arr(i + 1) = row(i) + row(i + 1)
    }

    arr.toList
  }
}

