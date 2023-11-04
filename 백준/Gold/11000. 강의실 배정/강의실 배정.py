import sys
import heapq
N = int(sys.stdin.readline())
timetable = []
for i in range(N):
  timetable.append(list(map(int, sys.stdin.readline().split())))
# timetable을 끝나는 시간, 시작 시간 순으로 정렬
timetable.sort(key=lambda x: (x[0]))

classRooms = [] # 끝나는 시간만 들어감

# 첫번째 강의 끝나는 시간을 heap에 넣음
heapq.heappush(classRooms, timetable[0][1])
for i in range(1, N):
    if classRooms and classRooms[0] <= timetable[i][0]:
        heapq.heappop(classRooms) # 맨 앞의 회의를 pop하고
    heapq.heappush(classRooms, timetable[i][1]) # 현재 강의를 push

# 필요한 회의실의 수를 출력
print(len(classRooms))
