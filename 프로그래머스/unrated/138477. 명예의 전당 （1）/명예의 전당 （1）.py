def solution(k, score):
    result = []
    honor = []
    for i in range(0, len(score), 1):
        honor.append(score[i])
        honor.sort()
        if len(honor) < k + 1:
            result.append(honor[0])
        elif len(honor) > k:
            honor.sort(reverse=True)
            sum = []
            for j in range(0, k, 1):
                sum.append(honor[j])
            result.append(sum[k-1])
    return result