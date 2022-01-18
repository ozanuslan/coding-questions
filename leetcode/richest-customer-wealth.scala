object Solution {
    def maximumWealth(accounts: Array[Array[Int]]): Int = {
        accounts.foldLeft(0)((acc, n) => acc max (n.sum))
    }
}
