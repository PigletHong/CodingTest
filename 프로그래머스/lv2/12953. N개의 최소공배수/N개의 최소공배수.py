def solution(arr):
    arr.sort()
    last = arr[-1]
    cnt = len(arr)
    num = 1

    while cnt != 0:
        for i in arr:
            if (last * num) % i == 0:
                cnt -= 1
            elif (last * num) % i != 0:
                cnt = len(arr)
                break
        num += 1

    return last * (num - 1)
