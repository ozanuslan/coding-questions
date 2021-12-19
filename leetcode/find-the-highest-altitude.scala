object Solution {
    def largestAltitude(gain: Array[Int]): Int = {
        var alt = 0
        var highest = alt 
        
        gain.foreach(n => {
            alt += n
            highest = highest max alt
        })
        
        highest
    }
}
