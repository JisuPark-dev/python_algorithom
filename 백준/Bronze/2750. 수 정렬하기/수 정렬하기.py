n = int(input())

a = []

for i in range(n):
    b = int(input())
    a.append(b)

a.sort()
for i in a:
    print(i)