s,p= map(int,input().split())
start = 0
end = start+p
answer=0
arr = list(input())
a,c,g,t = map(int, input().split())



aa =0
cc =0
gg=0
tt =0
for i in arr[start: end]:
    if i == "A":
        aa+=1
    elif i == "C":
        cc+=1
    elif i == "G":
        gg+=1
    else:
        tt+=1

while end<=s:
    
    if aa>=a and cc>=c and gg>=g and tt>=t:
        answer+=1
    
    if arr[start] == "A":
        aa-=1
    elif arr[start] == "C":
        cc-=1
    elif arr[start] == "G":
        gg-=1
    else:
        tt-=1


    start+=1
    end+=1
    if end>s:
        break
    if arr[end-1] == "A":
        aa+=1
    elif arr[end-1] == "C":
        cc+=1
    elif arr[end-1] == "G":
        gg+=1
    elif arr[end-1] == "T":
        tt+=1
print(answer)