def solution(name, yearning, photo):
    enum = {}
    answer = []
    for i in range(0, len(name), 1):
        enum[name[i]] = yearning[i]
    for i in photo:
        cnt = 0
        for j in i:
            if enum.get(j) is not None:
                cnt += enum.get(j)
        answer.append(cnt)

    return answer