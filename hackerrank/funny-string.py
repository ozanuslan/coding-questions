#!/bin/python3

import math
import os
import random
import re
import sys
import functools

#
# Complete the 'funnyString' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def funnyString(s):
    diff = []    
    
    i = 0
    while i < len(s) - 1:
        currChar = s[i]
        nextChar = s[i + 1]
        diff.append(abs(ord(currChar) - ord(nextChar)))
        i += 1
    
    return "Funny" if isPalindrome(diff) else "Not Funny"
    
def isPalindrome(arr):
    l = 0
    r = len(arr) - 1
    
    while(l < r):
        if arr[l] != arr[r]:
            return False
        l += 1
        r -= 1

    return True
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    for q_itr in range(q):
        s = input()

        result = funnyString(s)

        fptr.write(result + '
')

    fptr.close()
