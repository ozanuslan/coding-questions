object Solution {
    def squareIsWhite(coordinates: String): Boolean = {
        coordinates(0) % 2 != coordinates(1) % 2
    }
}
