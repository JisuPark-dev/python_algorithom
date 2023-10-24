n, m = map(int, input().split())
inp = list(map(int, input().split()))
arr = [0 for i in range(n)]
answer = 0
visited = [0 for i in range(n)]  # the size should be based on 'n' as it relates to inp[]

def recursion(limit, index, start):
    global answer
    if index == limit:
        if sum(arr[:limit]) == m:  # we should only sum up to 'limit'
            answer += 1
        return
    for i in range(start, len(inp)):
        if visited[i]:
            continue
        visited[i] = 1
        arr[index] = inp[i]
        recursion(limit, index + 1, i + 1)
        visited[i] = 0

for i in range(1, n+1):
    recursion(i, 0, 0)

print(answer)
