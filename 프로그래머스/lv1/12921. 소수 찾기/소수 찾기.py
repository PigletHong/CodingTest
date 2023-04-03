def solution(n):
    cnt = 0
    if n >= 2:
        cnt += 1
    for i in range(3, n + 1, 2):
        if isPrime(i) == 1:
            cnt += 1
    return cnt

def isPrime(num):
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return 0
    return 1
