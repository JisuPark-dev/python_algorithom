n = int(input())
m = int(input())

#배열 받기
arr = [[]for i in range(n)]

for i in range(n):
    a= list(map(int,input().split()))
    for j in range(len(a)):
        if a[j] == 1:
            arr[i].append(j+1)

# print(arr)


#dfs
visited = [False for i in range(n)]
answer2 = []

def dfs(x):
    answer.append(x)
    visited[x-1] = True
    for i in arr[x-1]:
        if not visited[i-1]:
            dfs(i)

for i in range(n):
    answer = []
    if not visited[i]:
        dfs(i+1)
        answer2.append(answer)

# print(answer2)


#탐색해야하는 배열 받기
problem = list(map(int, input().split()))

# print("problem",problem)

def findd() : 
    for i in range(len(problem)-1):
        for j in answer2:
            if problem[i] in j:
                # print("j",j)
                if problem[i+1]in j:
                    continue
                else:
                    return False
    return True

if findd():
    print("YES")
else:
    print("NO")
