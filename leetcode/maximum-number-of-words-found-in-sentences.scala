object Solution {
    def mostWordsFound(sentences: Array[String]): Int = {
        sentences.foldLeft(0)((acc, st) => acc max st.split(" ").length)
    }
}
