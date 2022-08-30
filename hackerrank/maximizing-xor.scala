import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

    /*
     * Complete the maximizingXor function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    def maximizingXor(l: Int, r: Int): Int = {
    // Write your code here
        // Naive O(n^2) solution
        // var maxValue = 0
        // for(i <- l to r) {
        //    for(j <- i + 1 to r) {
        //        maxValue = (i ^ j) max maxValue
        //    }
        // }
        // maxValue
        
        // Optimized O(1) solution
        val binaryXor = (l ^ r).toBinaryString
        val noZeroPrefixBinary = binaryXor.dropWhile(_.asDigit == 0)
        val maxBinary = noZeroPrefixBinary.replaceAllLiterally("0", "1")
        Integer.parseInt(maxBinary, 2)
    }
    
}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val l = StdIn.readLine.trim.toInt

        val r = StdIn.readLine.trim.toInt

        val result = Result.maximizingXor(l, r)

        printWriter.println(result)

        printWriter.close()
    }
}

