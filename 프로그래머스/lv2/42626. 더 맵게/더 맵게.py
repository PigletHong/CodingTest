import heapq


def solution(scoville, K):
    heapq.heapify(scoville)
    cnt = 0
    if scoville[0] >= K:
        return 0
    while scoville[0] < K and len(scoville) > 1:
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        new = first + (second * 2)
        heapq.heappush(scoville, new)
        cnt += 1

    if len(scoville) == 1 and scoville[0] < K:
        return -1
    else:
        return cnt