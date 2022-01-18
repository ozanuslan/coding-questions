object Solution {
    def numJewelsInStones(jewels: String, stones: String): Int = {
        stones.foldLeft(0)((acc, stone) => if(jewels.contains(stone)) acc + 1 else acc)
    }
}
