def solution(s):
    same, diff = 0, 0
    sum = list(s)
    x = sum[0]
    cnt = 0
    str = []
    answer = []
    for i in range(0, len(sum), 1):
        if sum[i] == x:
            same += 1
            str += sum[i]
        elif sum[i] != x:
            diff += 1
            str += sum[i]
        if same == diff:
            same, diff = 0, 0
            cnt += 1
            answer.append("".join(str))
            str = []
            if i < len(sum) - 1:
                x = sum[i + 1]
    if "".join(answer) == s:
        return len(answer)
    else:
        return len(answer) + 1