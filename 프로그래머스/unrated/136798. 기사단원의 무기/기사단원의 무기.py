def solution(number, limit, power):
    sum = []
    answer = 0
    for i in range(1, number + 1, 1):
        if getMyDivisor(i) <= limit:
            sum.append(getMyDivisor(i))
        else:
            sum.append(power)
    for i in sum:
        answer += i
    return answer


def getMyDivisor(num):
    divisorsList = []

    for i in range(1, int(num ** (1 / 2)) + 1):
        if (num % i == 0):
            divisorsList.append(i)
            if ((i ** 2) != num):
                divisorsList.append(num // i)
    divisorsList.sort()
    return len(divisorsList)