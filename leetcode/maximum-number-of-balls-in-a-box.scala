object Solution {
    def countBalls(lowLimit: Int, highLimit: Int) = {
    (lowLimit to highLimit)
      .map(_.toString.map(_.asDigit).sum)
      .groupBy(identity)
      .map(_._2.length)
      .max
  }
}
