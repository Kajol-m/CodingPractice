#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'designerPdfViewer' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY h
#  2. STRING word
#

def designerPdfViewer(h, word):
    # Write your code here
    dicth={}
    j=97
    maxh=0
    highlight=0
    for i in h:
        dicth[chr(j)]=i
        j+=1
    for i in word:
        if dicth[i]>maxh:
            maxh=dicth[i]
    highlight=maxh*len(word)
    
    return highlight

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    h = list(map(int, input().rstrip().split()))

    word = input()

    result = designerPdfViewer(h, word)

    fptr.write(str(result) + '\n')

    fptr.close()
