def solution(num_list):
    odd = 0
    even = 0
    for i in num_list:
        if i % 2 != 1:
            odd += 1
        if i % 2 == 1:
            even += 1
    answer = []
    answer.append(odd)
    answer.append(even)
    return answer