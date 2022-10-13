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
     * Complete the encryption function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    def encryption(s: String): String = {
    // Write your code here
        val stripped = s.replaceAll("\s+", "")
        var row = floor(sqrt(stripped.length)).toInt
        var col = ceil(sqrt(stripped.length)).toInt
        
        if(row * (col - 1) >= stripped.length) col -= 1
        else if((row + 1) * col >= stripped.length) row += 1
        
        var encrypted = ""
        for(i <- 0 until col) {
            for(j <- 0 until row) {
                val idx = (j * col) + i
                if(idx < stripped.length) {
                    encrypted += stripped(idx)
                }
                if(j == row - 1) encrypted += " "
            }
        }
        
        encrypted.trim
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = StdIn.readLine

        val result = Result.encryption(s)

        printWriter.println(result)

        printWriter.close()
    }
}

