import sys
input = sys.stdin.readline

n = int(input())
arr = sorted(list(map(int, input().split())))

cnt =0

for k in range(n):
    find = arr[k]
    i = 0
    j = n-1
    while i<j:
        if arr[i] + arr[j] == find:
            if i!=k and j!=k: #i,j 가 k와 다르도록 조건 추가
                cnt+=1
                break
            elif i==k:
                i+=1
            elif j == k:
                j-=1
        elif arr[i] + arr[j] > find:
            j-=1
        else:
            i+=1
print(cnt)