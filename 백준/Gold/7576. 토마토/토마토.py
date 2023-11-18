import sys
from collections import deque

Y = 0
X = 1
COUNT = 2

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

g_x, g_y = map(int, sys.stdin.readline().split())
box = []
visited = [[0 for i in range(g_x)] for j in range(g_y)]
for _ in range(g_y):
  box.append(list(map(int, sys.stdin.readline().split())))


def validateRange(nx, ny):
  global g_x, g_y
  if ny < 0 or ny > g_y - 1 or nx < 0 or nx > g_x - 1:
    return False
  return True

queue = deque([])
for i in range (g_y):
  for j in range (g_x):
    if box[i][j] == 1:
      queue.append([i, j, 0])

def solution():
  global g_x, g_y
  res = 0
  
  while(queue):
    cur = queue.popleft()
    if (cur[COUNT] > res):
      res = cur[COUNT]
    
    for i in range(4):
      nx = cur[X] + dx[i]
      ny = cur[Y] + dy[i]
      if validateRange(nx, ny) and box[ny][nx] == 0 and visited[ny][nx] == 0:
        visited[ny][nx] = 1
        box[ny][nx] = cur[COUNT]+1
        queue.append([ny, nx, cur[COUNT] + 1])

  # 가능한지 검증 
  for i in range (g_y):
    for j in range (g_x):
      if box[i][j] == 0:
        res = -1
        return res

  return res

print(solution())

