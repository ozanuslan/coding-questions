object Solution {
    def wateringPlants(plants: Array[Int], capacity: Int): Int = {
        var currentCap = capacity
        var totalSteps = 1
        
        // cap = 10
        // 1, 5, 3, 4 <- flowers
        // 9, 4, 1, 6 <- capacity
        // 1, 2, 3, 10<- steps
    // -1, 0, 1, 2, 3 <- indices
        
        for(i <- 0 until plants.length - 1) {
            currentCap -= plants(i)
            if(plants(i+1) > currentCap) {
                totalSteps += (i+1) * 2
                currentCap = capacity
            }
            totalSteps += 1
        }
        
        totalSteps
    }
}
