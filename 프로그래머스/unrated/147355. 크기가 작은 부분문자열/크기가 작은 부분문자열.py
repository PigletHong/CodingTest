def solution(t, p):
    sum = []
    cnt = 0
    length = len(p)
    for i in range(0, len(t) - len(p) + 1, 1):
        sum.append(t[i:i+length])
    for i in sum:
        if int(i) <= int(p):
            cnt +=1
    return cnt