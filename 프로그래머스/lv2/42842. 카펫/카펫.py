def solution(brown, yellow):
    answer = []
    total = yaksu_guhagi(brown + yellow)
    print(total)
    for i in range(0, len(total) - 1, 1):
        for j in range(i, len(total) - 1, 1):
            if total[i] * total[j] == brown + yellow and (total[i] - 2) * (total[j] - 2) == yellow:
                answer.append(total[i])
                answer.append(total[j])
    answer.sort(reverse=True)
    return answer


def yaksu_guhagi(sum):
    total = []
    for i in range(1, sum // 2 + 1, 1):
        if sum % i == 0:
            total.append(i)
    total.append(sum)
    return total