from itertools import combinations
n,m = map(int,input().split())
arr  = list(map(int, input().split()))
arr_sum = []
result = [0]*1000
a_s = 0
for i in range(len(arr)):
    a_s+=arr[i]
    a_s = a_s%m
    arr_sum.append(a_s)
    result[a_s]+=1
# print(arr_sum)
answer = 0
# for i in range(len(arr_sum)):
#     if arr_sum[i] == 0:
#         answer+=1
#     for j in range(i+1, len(arr_sum)):
#         if arr_sum[j] - arr_sum[i] == 0:
#             answer+=1
# print(answer)

# print(result)
for i in range(len(result)):
    if i == 0:
        answer+=result[i] + (result[i] * (result[i]-1))/2
    else:
        answer+=(result[i] * (result[i]-1))/2
print(int(answer))