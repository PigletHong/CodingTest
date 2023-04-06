def solution(A, B):
    A.sort()
    B.sort(reverse = True)
    answer = 0
    for i in range(0, len(A), 1):
        answer += A[i] * B[i]
    return answer