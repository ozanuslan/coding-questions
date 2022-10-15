object Solution {
    def subtractProductAndSum(n: Int): Int = {
        val digits = n.toString.map{_.asDigit}
        digits.product - digits.sum
    }
}
