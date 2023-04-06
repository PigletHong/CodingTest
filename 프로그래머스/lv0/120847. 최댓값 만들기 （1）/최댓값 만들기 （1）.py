def solution(numbers):
    numbers.sort()
    legth = len(numbers)
    return numbers[legth - 2] * numbers[legth - 1]