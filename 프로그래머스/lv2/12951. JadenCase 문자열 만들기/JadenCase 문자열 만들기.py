def solution(s):
    a = list(s)
    for i in range(len(a)):
        if i == 0:
            a[0] = a[0].upper()
        else:
            if a[i-1] == ' ':
                a[i] = a[i].upper()
            else:
                a[i] = a[i].lower()
    answer = ''
    for i in a:
        answer = answer+i
    return answer