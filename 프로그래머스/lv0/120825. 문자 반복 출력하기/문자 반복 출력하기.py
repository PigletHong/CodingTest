def solution(my_string, n):
    sum = list(my_string)
    answer = []
    for i in range(0, len(sum), 1):
        answer.append(sum[i] * n)
    return "".join(answer)