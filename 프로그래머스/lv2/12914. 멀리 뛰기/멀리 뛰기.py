def solution(n):
    temp = dict()

    temp[0] = 1
    temp[1] = 1

    for i in range(2, n + 1):
        temp[i] = temp[i - 1] + temp[i - 2]

    answer = temp[n] % 1234567
    return answer