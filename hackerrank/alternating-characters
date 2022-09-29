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
     * Complete the alternatingCharacters function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    def alternatingCharacters(s: String): Int = {
    // Write your code here
        if(s.length <= 1) return 0
        
        var lastNonConsecutiveChar = s(0)
        var numOfCharsToDelete = 0
        var idx = 1
        
        for(idx <- 1 until s.length) {
            if(lastNonConsecutiveChar == s(idx)) numOfCharsToDelete += 1
            else lastNonConsecutiveChar = s(idx) 
        }
        
        numOfCharsToDelete
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val q = StdIn.readLine.trim.toInt

        for (qItr <- 1 to q) {
            val s = StdIn.readLine

            val result = Result.alternatingCharacters(s)

            printWriter.println(result)
        }

        printWriter.close()
    }
}

