n = int(input())
# 홀수개 일 떄 : 2**k -1
# 가운데가 루트 / 가운데 기준으로 왼쪽 오른쪽 서브트리
# 함수
# 입력 : list[], depth ->  출력 : left[], right[], mid = 저장하는 값, depth = answer의 idx
# left[], right[] -> 재귀적으로 함수 실행
# 종료조건은 len(list[]) = 1?
answer = [[] for _ in range(n)]
buildings = list(map(int, input().split()))


#  오른 서브트리 이 구하기 - 만약 3개짜리라면
def solution(list, depth):
  global answer
  if len(list) == 0:
    return

  mid_idx = int(len(list) / 2)  # 1
  left = list[:mid_idx]  # 1, 2
  right = list[mid_idx + 1:]
  mid = list[mid_idx]

  #  서브트리 구하기
  solution(left, depth+1)
  # 오른 서브트리 구하기
  solution(right, depth+1)

  answer[depth].append(mid)


solution(buildings, 0)

for i in answer:
  print(*i)