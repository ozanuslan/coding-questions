object Solution {
    def canReach(arr: Array[Int], start: Int): Boolean = {
        // DFS solution, O(n) time O(n) space
        if(start < 0 || start >= arr.length || arr(start) < 0) false
        else {
            arr(start) *= -1
            arr(start) == 0 || canReach(arr, start + arr(start)) || canReach(arr, start - arr(start))
        }
    }
}
