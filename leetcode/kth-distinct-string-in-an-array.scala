object Solution {
    def kthDistinct(arr: Array[String], k: Int): String = {
        // val notInclude = (arr.toList diff arr.toSet.toList).distinct
        // val filtered = arr.filter(!notInclude.contains(_))
        // if(filtered.length < k) ""
        // else filtered(k - 1)
        
        var m = scala.collection.mutable.Map[String, Int]()
        
        for(str <- arr) {
            if(m.contains(str)) m(str) += 1
            else m(str) = 1
        }
        
        var cnt = 0
        for(str <- arr) {
            if(m(str) == 1) {
                cnt += 1
                if(k == cnt) return str
            }
        }
        
        ""
    }
}
