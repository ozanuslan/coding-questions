class ParkingSystem(_big: Int, _medium: Int, _small: Int) {
    var big = _big
    var medium = _medium
    var small = _small
    
    def addCar(carType: Int): Boolean = {
        if(carType == 1 && big > 0) {
            big -= 1
            true
        } else if(carType == 2 && medium > 0) {
            medium -= 1
            true
        } else if(carType == 3 && small > 0) {
            small -= 1
            true
        } else false
    }

}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * var obj = new ParkingSystem(big, medium, small)
 * var param_1 = obj.addCar(carType)
 */
