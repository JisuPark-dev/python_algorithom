def solution(s):
    a = list(map(str,sorted(list(map(int,s.split())))))
    answer = ''
    answer = answer+a[0] +' ' + a[-1]
    return answer