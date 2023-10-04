n = int(input())
stack = []
answer = []
for i in range(n):
    a = input().split()
    if a[0] == "push":
        stack.append(int(a[1]))
        continue
    if a[0] == "pop":
        if len(stack) ==0:
            answer.append(-1)
            continue
        else:
            answer.append(stack.pop())
            continue
    if a[0] == "size":
        answer.append(len(stack))
        continue
    if a[0] == "empty":
        if len(stack) == 0:
            answer.append(1)
            continue
        else:
            answer.append(0)
            continue
    if a[0] == "top":
        if len(stack) == 0:
            answer.append(-1)
            continue
        else:
            answer.append(stack[-1])
            continue
for i in answer:
    print(i)