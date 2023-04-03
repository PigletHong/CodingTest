def solution(a, b):
    day = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"]
    month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    sum = 0
    for i in range(0, a - 1, 1):
        sum += month[i]
    sum += b
    sum = int(sum % 7)

    return day[sum - 1]