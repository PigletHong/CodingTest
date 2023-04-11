from collections import deque


def solution(k, tangerine):
    answer = 0
    cnt2 = 0
    tangerine.sort()
    q = deque(tangerine)
    start = q.popleft()
    cnt = 1
    count = []
    while q:
        var = q.popleft()
        if start == var:
            cnt += 1
        elif start != var:
            count.append(cnt)
            cnt = 1
            start = var
    count.append(cnt)
    count.sort(reverse=True)

    for i in count:
        cnt2 += i
        answer += 1
        if cnt2 >= k:
            return answer
