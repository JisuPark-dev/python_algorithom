n, m = map(int, input().split())
inp = list(map(int, input().split()))
arr = [0 for i in range(n)]
answer = 0
visited = [0 for i in range(n)]


def recursion(limit, index, start):
  global answer
  if (index >= limit):
    sum = 0
    for i in arr:
      sum += i
    if (sum == m):
      answer += 1
  else:
    for i in range(start, len(inp)):
      if (visited[i] == 1):
        continue
      visited[i] = 1
      arr[index] = inp[i]
      recursion(limit, index + 1, i + 1)
      visited[i] = 0
      arr[index] = 0


for i in range(1, n+1):
  recursion(i, 0, 0)

print(answer)
