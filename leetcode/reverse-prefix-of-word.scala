object Solution {
    def reversePrefix(word: String, ch: Char): String = {
        val i = word.indexOf(ch.toString)
        word.substring(0, i + 1).reverse + word.substring(i + 1)
    }
}
