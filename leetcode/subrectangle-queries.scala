class SubrectangleQueries(_rectangle: Array[Array[Int]]) {

  def updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int): Unit = {
    for (r <- row1 to row2; c <- col1 to col2) {
      val current = _rectangle(r)(c)
      _rectangle(r)(c) = newValue
    }
  }

  def getValue(row: Int, col: Int): Int = {
    _rectangle(row)(col)
  }

}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * var obj = new SubrectangleQueries(rectangle)
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue)
 * var param_2 = obj.getValue(row,col)
 */