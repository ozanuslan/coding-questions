object Solution {
    def minimumRefill(plants: Array[Int], capacityA: Int, capacityB: Int): Int = {
        var pAlice = 0
        var cAlice = capacityA
        var pBob = plants.length - 1
        var cBob = capacityB
        var totalRefills = 0
        
        // 1 2 4 4 5
        // A = 6 B = 5 
        
        while(pAlice < pBob) {          
            if(cAlice < plants(pAlice)) { 
                cAlice = capacityA
                totalRefills += 1
            }
            if(cBob < plants(pBob)){ 
                cBob = capacityB
                totalRefills += 1
            }
            
            cAlice -= plants(pAlice)
            cBob -= plants(pBob)
            
            pAlice += 1
            pBob -= 1
        }
        
        if(pAlice == pBob) {
            if (cAlice < cBob){
                if(cBob < plants(pBob)) 
                    totalRefills += 1
            } else {
                if(cAlice < plants(pAlice))
                    totalRefills += 1
            }
        }
        
        totalRefills
    }
}
