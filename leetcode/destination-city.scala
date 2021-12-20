object Solution {
    def destCity(paths: List[List[String]]): String = {
        // Hurray!!! A fully functional solution!
        paths.groupBy(_(1)).keySet.filterNot(paths.groupBy(_(0)).keySet).head
    }
}
