import sys
n = int(sys.stdin.readline())

for i in range(n):
    things = input()
    
    cnt = 0
    for j in things:
        if j == '(':
            cnt+=1
        elif j == ')':
            cnt-=1
        if cnt == -1:
            print("NO")
            break
    else:
        if cnt == 0:
            print("YES")
        else:
            print("NO")
        