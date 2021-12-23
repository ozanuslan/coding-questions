object Solution {
    def busyStudent(startTime: Array[Int], endTime: Array[Int], queryTime: Int): Int = {
        var cnt = 0
        
        for(i <- 0 until startTime.length) 
            if(startTime(i) <= queryTime && queryTime <= endTime(i)) cnt += 1
        
        cnt
    }
}
