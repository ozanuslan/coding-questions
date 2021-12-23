object Solution {
  def selfDividingNumbers(left: Int, right: Int): List[Int] = {
    var l = List[Int]()
    for (i <- left until right + 1) {
      if (isSelfDividing(i)) l = l :+ i
    }
    l
  }

  def isSelfDividing(n: Int): Boolean = {
    val nStr = n.toString
    if (nStr.contains('0')) false
    else nStr.forall(c => n % (c - 48) == 0)
  }
}
