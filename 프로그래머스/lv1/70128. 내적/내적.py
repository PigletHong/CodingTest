def solution(a, b):
    length = len(a)
    sum = 0
    for i in range(0, length, 1):
        sum += a[i] * b[i]
    return sum