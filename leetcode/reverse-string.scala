object Solution {
    def reverseString(s: Array[Char]): Unit = {
        val n = s.length
        for(i <- 0 until n / 2) {
            val temp = s(i)
            s(i) = s(n - i - 1)
            s(n - i - 1) = temp
        }
    }
}
