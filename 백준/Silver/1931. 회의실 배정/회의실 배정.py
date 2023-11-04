import sys

N = int(sys.stdin.readline())
timetable = []
for i in range(N):
  timetable.append(list(map(int, sys.stdin.readline().split())))

# print("timetable : ", timetable)

# 첫번째 걸 고른다
# -> 시작시간이 끝나는 시간보다 작은걸 고른다.
# 1 4
# 5 7
# 8 11
# 12 14

timetable.sort(key=lambda x: (x[1], x[0]))

count = 0
endTime = 0
for i in range(N):
  if timetable[i][0] >= endTime:
    endTime = timetable[i][1]
    count += 1

print(count)
