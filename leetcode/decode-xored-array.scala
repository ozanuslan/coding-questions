object Solution {
    def decode(encoded: Array[Int], first: Int): Array[Int] = {
        var res = new Array[Int](encoded.length + 1)
        res(0) = first
        for(i <- 1 until res.length) {
            res(i) = encoded(i-1) ^ res(i-1)
        }
        res
    }
}

object Solution {
    def decode(encoded: Array[Int], first: Int): Array[Int] = {
        encoded
        .indices
        .foldLeft(Array[Int](first))(
            (acc, i) => acc :+ (encoded(i)^acc(i))
        )
    }
}

