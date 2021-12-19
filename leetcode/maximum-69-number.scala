object Solution {
    def maximum69Number (num: Int): Int = {
        // Safer solution without return <- Meaning i'm scared of return :)
        // var changed = false
        // var numStr = num.toString
        // for(i <- 0 until numStr.length; if(!changed)){
        //     if(numStr(i) == '6') {
        //         numStr = numStr.substring(0,i) + "9" + numStr.substring(i+1)
        //         changed = true
        //     }
        // }
        // numStr.toInt
        
        // 'Dangerous solution' with return
        val numStr = num.toString
        
        for(i <- 0 until numStr.length) {
            if(numStr(i) == '6') return (numStr.substring(0,i) + "9" + numStr.substring(i+1)).toInt 
        }
        
        num
    }
}
