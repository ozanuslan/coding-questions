object Solution {
    def countMatches(items: List[List[String]], ruleKey: String, ruleValue: String): Int = {
        var key = 0
        if(ruleKey.equals("color"))
            key = 1
        else if (ruleKey.equals("name"))
            key = 2
        
        var count = 0
        for(i <- 0 until items.length){
            if(items(i)(key).equals(ruleValue)) count += 1
        }
        
        count
    }
}
