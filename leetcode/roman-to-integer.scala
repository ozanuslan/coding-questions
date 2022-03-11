object Solution {
    val roman = Map[Char,Int]() + 
                ('I' -> 1) +
                ('V' -> 5) +
                ('X' -> 10) +
                ('L' -> 50) +
                ('C' -> 100) +
                ('D' -> 500) +
                ('M' -> 1000)
    def romanToInt(s: String): Int = {
        val len = s.length
        (0 until len - 1).foldLeft(0)((acc, idx) => {
            if(roman(s(idx)) < roman(s(idx + 1))) acc - roman(s(idx)) else acc + roman(s(idx))
        }) + roman(s(len - 1))
    }
}
