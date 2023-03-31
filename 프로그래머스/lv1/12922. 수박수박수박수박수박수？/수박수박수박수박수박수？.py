def solution(n):
    arr = []
    for i in range(1, n+1, 1):
        if i % 2 == 1:
            arr.append("수")
        else:
            arr.append("박")
    answer = "".join(arr)
    return answer