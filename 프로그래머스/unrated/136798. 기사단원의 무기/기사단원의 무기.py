import math

def solution(number, limit, power):
    answer = 0
    for i in range(1,number+1):
        now = i
        attack = set()
        for j in range(1, int(math.sqrt(now)+1)):
            if now % j ==0:
                attack.add(j)
                attack.add(now/j)
        if len(attack) >limit:
            answer+=power
        else:
            answer += len(attack)
    return answer