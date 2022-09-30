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
     * Complete the minimumDistances function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    def minimumDistances(a: Array[Int]): Int = {
    // Write your code here
        var minDist = Int.MaxValue
        
        val m = scala.collection.mutable.Map[Int, Int]()
        
        for(i <- 0 until a.length) {
            val num = a(i)
            m.get(num) match {
                case Some(j) => {
                    val dist = i - j
                    minDist = minDist min dist
                    m(num) = i
                }
                case None => {
                    m(num) = i
                }
            }
        }
        
        if(minDist == Int.MaxValue) -1 else minDist
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val a = StdIn.readLine.replaceAll("\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.minimumDistances(a)

        printWriter.println(result)

        printWriter.close()
    }
}

