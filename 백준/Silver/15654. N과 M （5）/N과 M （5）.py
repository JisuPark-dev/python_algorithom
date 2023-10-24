n, m = map(int, input().split())
inp = list(map(int, input().split()))
inp = sorted(inp)
arr = [0 for i in range(m)]
visited = [0 for i in range(100)]

#1 7 8 9
def recursion(idx, limit):
  if (limit <= idx):
    for i in arr:
      print(i, end=" ")
    print()
    return
  else:
    for i in range (len(inp)):
      if (visited[i] == 1):
        continue
      visited[i] = 1
      arr[idx] = inp[i]
      recursion(idx + 1, limit)
      visited[i] = 0


recursion(0, m)
