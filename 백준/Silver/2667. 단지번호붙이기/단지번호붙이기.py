import sys

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

n = int(sys.stdin.readline())
graph = []
for _ in range(n):
  tmp = []
  inp = sys.stdin.readline().strip()
  for i in range(0, len(inp)):
    tmp.append(int(inp[i]))
  graph.append(tmp)
answer = []



def dfs(y, x):
  global cnt
  for i in range(4):
    if (-1 < x + dx[i] < n and -1 < y + dy[i] < n
        and graph[y + dy[i]][x + dx[i]] == 1):
      graph[y + dy[i]][x + dx[i]] = 0
      cnt += 1
      dfs(y + dy[i], x + dx[i])
  


for i in range(n):
  for j in range(n):
    cnt = 1
    if graph[i][j] == 1:
      graph[i][j] = 0
      dfs(i, j)
      answer.append(cnt)

answer.sort()
print(len(answer))
for i in answer:
  print(i)
