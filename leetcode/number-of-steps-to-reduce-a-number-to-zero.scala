object Solution {
    def numberOfSteps(num: Int): Int = {
        val binStr = num.toBinaryString
        binStr.length - 1 + binStr.count(_ == '1')
    }
}
