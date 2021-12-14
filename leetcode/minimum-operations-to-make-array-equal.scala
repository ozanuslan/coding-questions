object Solution {
    def minOperations(n: Int): Int = {
        if(n % 2 == 1) {
            val elems = (n - 1) / 2
            elems * (elems + 1)
        } else {
            val elems = n / 2
            elems * elems
        }
    }
}
