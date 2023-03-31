def solution(absolutes, signs):
    sum = 0
    length = len(absolutes)
    for i in range(0, length, 1):
        if signs[i]:
            sum += absolutes[i]
        else:
            sum -= absolutes[i]
    return sum