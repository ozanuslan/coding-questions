// 100% Runtime %100 Memory woohooo
class CustomStack(_maxSize: Int) {
    var size = -1
    var arr = new Array[Int](_maxSize)

    def push(x: Int) {
        if(!isFull) {
            size += 1
            arr(size) = x
        }
    }

    def pop(): Int = {
        if(!isEmpty) {
            size -= 1
            arr(size + 1)
        } else -1
    }

    def increment(k: Int, `val`: Int) {
        for(i <- 0 to size; if(i < k)) {
            arr(i) += `val`
        }
    }
    
    def isEmpty(): Boolean = {
        size == -1
    }
    
    def isFull(): Boolean = {
        size + 1 == _maxSize
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * var obj = new CustomStack(maxSize)
 * obj.push(x)
 * var param_2 = obj.pop()
 * obj.increment(k,`val`)
 */
