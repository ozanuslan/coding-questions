object Solution {
    def flipAndInvertImage(image: Array[Array[Int]]): Array[Array[Int]] = {
        var flipInvert = image
        val n = image.length
        
        for(i <- 0 until n) {
            for(j <- 0 until n / 2) {
                val mem = image(i)(j)
                image(i)(j) = if(image(i)(n - j - 1) == 0) 1 else 0
                image(i)(n - j - 1) = if(mem == 0) 1 else 0
            }
            if(n % 2 == 1){
                image(i)(n/2) = if(image(i)(n/2) == 0) 1 else 0
            }
        }
        
        flipInvert
    }
}
