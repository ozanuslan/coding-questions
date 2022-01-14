object Solution {
    def canBeTypedWords(text: String, brokenLetters: String): Int = {
        text.split(" ").filter(_.forall(!brokenLetters.contains(_))).length
    }
}
