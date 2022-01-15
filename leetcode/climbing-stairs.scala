object Solution {
    def climbStairs(n: Int): Int = {
        // Fibo, always looking back to total ways to
        // get at 1 step back and 2 steps back
        // then combining 1 step and 2 step
        // sums to our total will give us the answer
        if(n == 1) 1
        if(n == 2) 2
        else {
            var _n = 0; var n_1 = 2; var n_2 = 1
            (2 until n) foreach { i =>
                _n = n_1 + n_2
                n_2 = n_1
                n_1 = _n
            }
            _n
        }
    }
}
