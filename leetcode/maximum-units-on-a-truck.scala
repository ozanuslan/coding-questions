object Solution {
    def maximumUnits(boxTypes: Array[Array[Int]], truckSize: Int): Int = {
        val sorted = boxTypes.sortWith(_(1) > _(1))
        var boxes = 0
        var maxQuant = 0
        
        for(b <- sorted if(boxes < truckSize)) {
            if(b(0) + boxes > truckSize) {
                val lastBoxes = truckSize - boxes
                maxQuant += lastBoxes * b(1)
            } else {
                maxQuant += b(0) * b(1)
            }
            boxes += b(0)
        }
        
        maxQuant
        /*
        [
        [number of boxes, number of items in each box], 
        ...]
        */
    }
}
