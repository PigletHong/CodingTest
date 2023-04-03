def solution(sizes):
    가로 = []
    세로 = []

    for i in sizes:
        if i[0] < i[1]:
            가로.append(i[0])
            세로.append(i[1])
        else:
            가로.append(i[1])
            세로.append(i[0])

    가로.sort()
    세로.sort()
    sum = 가로[len(가로) - 1] * 세로[len(세로) - 1]
    return sum