def solution(s):
    numbers = list(map(int, s.split()))
    print(numbers)
    return str(min(numbers)) + " " + str(max(numbers))