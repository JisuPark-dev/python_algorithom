import sys
input = sys.stdin.readline

n = int(input())
m = int(input())
arr = sorted(list(map(int, input().split())))

cnt = 0
ptr1 = 0
ptr2 = n-1


while ptr1<ptr2:
    if arr[ptr1] + arr[ptr2] == m:
        cnt+=1
        ptr2-=1
        ptr1+=1
    elif arr[ptr1] + arr[ptr2] > m:
        ptr2-=1
    else:
        ptr1+=1
print(cnt)
