import sys

input = sys.stdin.readline

n = int(input())
arr = []
cnt = 0

for i in range(n):
    x = int(input())
    arr.append(x)
arr1 = [(j,i) for i,j in enumerate(arr)]
arr1.sort()
# print(arr1)

arr.sort()
arr2 = [(j,i) for i,j in enumerate(arr)]
# print(arr2)

answer = []
for i in range(n):
    answer.append(arr1[i][1] - arr2[i][1])
print(max(answer)+1)

