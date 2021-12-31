object Solution {
    def findTheDifference(s: String, t: String): Char = {
        (t diff s).charAt(0)
    }
}
