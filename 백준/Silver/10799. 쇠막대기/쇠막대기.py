stack = []
sticks = list(input())
res = 0
cnt = 0 #막대숫자
last = "" #가장 마지막 괄호
# print(sticks[0])

for stick in sticks:
    if(stick == "("):
      stack.append(stick)
      last = "("
      if(last == "("):
        cnt+=1
        res+=1
      # print(stack)
      # print(cnt)
    else:
      if last == "(":
        stack.pop()
        cnt-=1
        res-=1
        res +=cnt
        last = ")"
      else:
        stack.pop()
        cnt-=1
        last = ")"
      # print(stack)
      # print(cnt)

print(res)
