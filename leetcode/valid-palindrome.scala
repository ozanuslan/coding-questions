object Solution {
    def isPalindrome(s: String): Boolean = {
        var l = 0
        var r = s.length - 1

        while (l < r) {
            while (l < s.length - 1 && !isAlphanumeric(s(l).toLower)) {
                l+=1
            }
            while (r > 0 && !isAlphanumeric(s(r).toLower)) {
                r-=1
            }

            if (!isAlphanumeric(s(l).toLower) && !isAlphanumeric(s(r).toLower)) return true
            
            if (s(l).toLower != s(r).toLower) return false
            
            l+=1
            r-=1
        }

        true
    }

    def isAlphanumeric(ch: Character): Boolean = {
        ('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9')
    }
}
