def solution(my_string):
    sum = list(my_string)
    answer = []
    for i in range(len(my_string) - 1, -1, -1):
        answer.append(sum[i])
    return "".join(answer)