

import sys

dx = [1, 0, 0, -1]
dy = [0, -1, 1, 0]

y, x = map(int, sys.stdin.readline().split())
graph = []
visited = [[-1] * x for _ in range(y)]
for i in range(y):
  graph.append(list(map(int, sys.stdin.readline().split())))


def dfs(curr_x, curr_y):
  global y, x, res
  if (curr_y == y - 1 and curr_x == x - 1):
    return (1)
  if (visited[curr_y][curr_x] != -1):
    return (visited[curr_y][curr_x])
  else:
    ways = 0
    for i in range(4):
      nx = curr_x + dx[i]
      ny = curr_y + dy[i]
      if (0 <= nx < x and 0 <= ny < y and graph[ny][nx] < graph[curr_y][curr_x]):
        ways += dfs(nx, ny)
  visited[curr_y][curr_x] = ways
  return (visited[curr_y][curr_x])

if (y == 1 and x == 1):
  print(1)
  exit(0)

dfs(0, 0)

print(visited[0][0])