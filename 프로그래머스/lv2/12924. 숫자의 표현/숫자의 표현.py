def solution(n):
    start = 0
    end = 0
    sum = 0
    answer=1
    while(end!=n and n!=1):
        if sum == n:
            answer+=1
            start+=1
            sum+=start
        elif sum>n:
            sum-=end
            end+=1
        else:
            start+=1
            sum+=start
    return answer