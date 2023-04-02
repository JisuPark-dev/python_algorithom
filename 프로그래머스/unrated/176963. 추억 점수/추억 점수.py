def solution(name, yearning, photo):
    answer = []
    #name, yearning 쌍으로 딕셔너리 제작
    dict = {}
    for i in range(len(name)):
        dict[name[i]] = yearning[i]
    
    for i in range(len(photo)):
        ans = 0
        for j in photo[i]:
            if j in dict: #딕셔너리 안에 있을 경우에만 값 추가.
                ans+=dict[j]
                
        answer.append(ans)
        
    return answer