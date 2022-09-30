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
     * Complete the theLoveLetterMystery function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    def theLoveLetterMystery(s: String): Int = {
    // Write your code here
        if(s.length <= 1) return 0
        
        var leftPtr = 0
        var rightPtr = s.length - 1
        var opCount = 0
        while(leftPtr < rightPtr) {
            val requiredOps = (s(leftPtr) - s(rightPtr)).abs
            opCount += requiredOps
            
            leftPtr += 1
            rightPtr -= 1
        }
        
        opCount
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val q = StdIn.readLine.trim.toInt

        for (qItr <- 1 to q) {
            val s = StdIn.readLine

            val result = Result.theLoveLetterMystery(s)

            printWriter.println(result)
        }

        printWriter.close()
    }
}

