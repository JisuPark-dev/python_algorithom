def solution(s):
    a = sorted(list(map(int,s.split())))
   
    
    return f'{a[0]} {a[-1]}'