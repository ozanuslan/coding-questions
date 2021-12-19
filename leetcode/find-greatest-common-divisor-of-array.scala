object Solution {
    def findGCD(nums: Array[Int]): Int = {
        var maxV = Int.MinValue
        var minV = Int.MaxValue
        
        nums.foreach(n => {
            maxV = maxV max n
            minV = minV min n
        })
        
        gcd(minV, maxV)
    }
    
    def gcd(a: Int, b: Int): Int = {
        if(b == 0) a 
        else gcd(b, a % b)
    }
}
