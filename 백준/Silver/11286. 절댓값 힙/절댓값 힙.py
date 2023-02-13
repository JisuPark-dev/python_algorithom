import heapq
import sys

input = sys.stdin.readline

n = int(input())
arr = []

for i in range(n):
    x = int(input())
    if x !=0:
        heapq.heappush(arr, (abs(x),x))
    else:
        try:
            print(heapq.heappop(arr)[1])
        except:
            print(0)