object Solution {
    def minMovesToSeat(seats: Array[Int], students: Array[Int]): Int = {
        val sortedSeats = seats.sortWith(_ < _)
        val sortedStudents = students.sortWith(_ < _)
        
        var sum = 0
        for(i <- 0 until sortedSeats.length){
           sum += (sortedSeats(i) - sortedStudents(i)).abs 
        }
        sum
    }
}
