object Solution {
    def removeOccurrences(s: String, part: String): String = {
        var res = s
        while(res.contains(part)) {
            res = res.replaceFirst(part, "")
        }
        res
    }
}
