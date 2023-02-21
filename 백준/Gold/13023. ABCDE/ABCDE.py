import sys
sys.setrecursionlimit(100000)

n,m = map(int, input().split())
arr = [[]for i in range(n)]
visited = [False for i in range(n+1)]
stack = []
arrive = False
# visited[1] = True
# stack.append(1)
def dfs(x, depth):
	global arrive

	if depth == 5:
		arrive = True
		return 
	visited[x] = True
	for i in arr[x]: 
		if visited[i] == False:
			dfs(i, depth+1)
	visited[x] = False

for i in range(m):
	a,b = map(int, input().split())
	arr[a].append(b)
	arr[b].append(a)

for i in range(n):
	dfs(i,1)
	if arrive:
		break
if arrive:
	print(1)
else:
	print(0)