class Solution:
    def reorganizeString(self, s: str) -> str:
        """
        aab -> aba
        aaab -> ""
        aaacb -> acaba
        """
        if len(s) <= 1:
            return s
        from collections import Counter
        c = Counter(s)
        if max(c.values()) > (len(s) + 1) // 2:
            return ""
        c = sorted(c.items(), key=lambda x: x[1], reverse=True)
        res = [None] * len(s)
        i = 0
        for k, v in c:
            while v > 0:
                res[i] = k
                i += 2
                if i >= len(s):
                    i = 1
                v -= 1
        return "".join(res)
