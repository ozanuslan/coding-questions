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
     * Complete the equalizeArray function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    def equalizeArray(arr: Array[Int]): Int = {
    // Write your code here
        val mostOcurringElem = arr.groupBy(identity)
                                  .mapValues(_.size)
                                  .maxBy(_._2)
                                  ._1
        arr.length - arr.count(_ == mostOcurringElem)
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val arr = StdIn.readLine.replaceAll("\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.equalizeArray(arr)

        printWriter.println(result)

        printWriter.close()
    }
}

