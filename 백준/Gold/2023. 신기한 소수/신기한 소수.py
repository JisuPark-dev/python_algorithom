import math
import sys

sys.setrecursionlimit(5000)

n = int(input())

def sosu(x):
    if x ==1:
        return False
    for i in range(2,int(math.sqrt(x))+1):
        if x %i == 0:
            return False
            break
    return True

stack = [2,3,5,7]


for i in stack:
    for j in range(1,10):
        if sosu(i*10+j):
            stack.append(i*10+j)

            
for i in stack:
    if len(str(i)) == n:
        print(i)
    if len(str(i))>n:
        break