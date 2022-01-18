object Solution {
    def minPartitions(n: String): Int = {
        n.chars.max.getAsInt - '0'
    }
}object Solution {
    def minPartitions(n: String): Int = {
        n.foldLeft(0)((acc, num) => acc max num - 48)
    }
}
