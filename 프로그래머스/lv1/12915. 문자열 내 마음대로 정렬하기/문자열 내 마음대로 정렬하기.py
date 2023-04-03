def solution(strings, n):
    sum = []
    answer = []
    for i in strings:
        sum.append((i[n:n+1]) + i)
    sum.sort()
    for i in sum:
        length = len(i)
        answer.append(i[1:length])
    return answer