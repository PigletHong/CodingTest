def solution(numbers):
    sum = []
    for i in range(0, len(numbers), 1):
        for j in range(i + 1, len(numbers), 1):
            sum.append(numbers[i] + numbers[j])
    answer = list(set(sum))
    answer.sort()
    return answer