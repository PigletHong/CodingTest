def solution(a, b):
    arr = [a,b]
    arr2 = arr.sort()
    sum = 0;
    for i in range(arr[0], arr[1] + 1, 1):
        sum += i
    return sum