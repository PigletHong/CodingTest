def solution(food):
    answer = []
    for i in range(1, len(food)):
        if food[i] > 1:
            answer.extend([i] * int(food[i]/2))

    answer2 = sorted(answer, reverse=True)
    a = ''.join(map(str, answer))
    b = ''.join(map(str, answer2))
    c = a + "0" + b
    return c