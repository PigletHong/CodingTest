def solution(numbers):
    sum = 0
    none = 0
    for i in range(0, 10, 1):
        if i in numbers:
            none += i
        else:
            sum += i
    return sum