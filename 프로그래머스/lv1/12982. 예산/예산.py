def solution(d, budget):
    d.sort()
    cnt = 0
    for i in range(0, len(d), 1):
        budget -= d[i]
        cnt += 1
        if budget < 0:
            return cnt - 1
    return cnt