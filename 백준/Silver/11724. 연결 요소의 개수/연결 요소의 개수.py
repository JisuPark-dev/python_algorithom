import sys

sys.setrecursionlimit(5000)
input = sys.stdin.readline

n,m = map(int,input().split())
arr = [[]for i in range(n+1)]
stack = []
visited = [False]*(n+1)
visited[0] = True
cnt=0

for i in range(m):
    a,b = map(int,input().split())
    arr[a].append(b)
    arr[b].append(a)
    
def dfs(start) : 
    stack.extend(arr[start])
    while stack:
        now = stack.pop()
        if visited[now]!=True:
            visited[now] = True
            dfs(now)


for i in range(1,n+1):
    if not visited[i]:
        cnt+=1
        dfs(i)

print(cnt)