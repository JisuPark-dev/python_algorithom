import sys
input = sys.stdin.readline
n,m = map(int, input().split())
arr = list(map(int, input().split()))
arr_sum = [0]
for j in range(n):
    arr_sum.append(arr_sum[j] + arr[j])
# print(arr_sum)
for i in range(m):
    i,j = map(int, input().split())
    print(f'{arr_sum[j] - arr_sum[i-1]}')




    