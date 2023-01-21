#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'twoStrings' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING s1
#  2. STRING s2
#

# Time: O(n + m)
# Space: O(n)
def twoStrings(s1, s2):
    hasSubstring = False
    encountered = {}
    
    for ch in s1:
        encountered[ch] = 1
    
    for ch in s2:
        if encountered.get(ch) != None:
            hasSubstring = True
            break
    
    return "YES" if hasSubstring else "NO"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    for q_itr in range(q):
        s1 = input()

        s2 = input()

        result = twoStrings(s1, s2)

        fptr.write(result + '
')

    fptr.close()
