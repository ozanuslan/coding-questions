class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        char_count = 26 * [0]
        for ch in s:
            char_idx = getCharIndex(ord(ch))
            char_count[char_idx] += 1
        
        for ch in t:
            char_idx = getCharIndex(ord(ch))
            char_count[char_idx] -= 1
            if char_count[char_idx] < 0:
                return False
        
        return True
    
def getCharIndex(ch: int):
    return ch - 97
