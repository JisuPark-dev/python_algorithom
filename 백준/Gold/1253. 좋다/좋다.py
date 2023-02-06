import sys
input = sys.stdin.readline

n = int(input())
arr = sorted(list(map(int, input().split())))

cnt =0
# for i in range(2,len(arr)):
#     breaker =False
#     for j in range(0, i):
#         for k in range(j+1,i+1):
#             if arr[k] + arr[j] == arr[i]:
#                 cnt+=1
#                 breaker = True
#                 break
#         if breaker == True:
#             break
# print(cnt)

for k in range(n):
    find = arr[k]
    i = 0
    j = n-1
    while i<j:
        if arr[i] + arr[j] == find:
            if i!=k and j!=k:
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