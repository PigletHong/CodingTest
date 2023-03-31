def solution(arr, divisor):
    arr1 = []
    for i in arr:
        if i % divisor == 0:
            arr1.append(i)
    if len(arr1) == 0:
        arr1.append(-1)
    arr1.sort()
    return arr1