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
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    def repeatedString(s: String, n: Long): Long = {
    // Write your code here
        if(s.length == 0) return 0
        
        val stringRepetition = n / s.length
        val tailLen = n % s.length
        
        val headCount: Long = stringRepetition * s.count(_ == 'a')
        val tailCount: Long = s.substring(0, tailLen.toInt).count(_ == 'a')
        
        headCount + tailCount
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = StdIn.readLine

        val n = StdIn.readLine.trim.toLong

        val result = Result.repeatedString(s, n)

        printWriter.println(result)

        printWriter.close()
    }
}

