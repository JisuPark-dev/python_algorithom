from collections import deque

n,l= map(int,input().split())
arr = list(map(int, input().split()))
mydeque = deque()

for i in range(n):
    while mydeque and mydeque[-1][0] > arr[i]:
        mydeque.pop()
    mydeque.append((arr[i],i))
    if mydeque[0][1] <=i-l:
        mydeque.popleft()
    print(mydeque[0][0], end=' ')