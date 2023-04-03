def solution(nums):
    cnt = 0
    for i in range(0, len(nums), 1):
        for j in range(i + 1, len(nums), 1):
            for k in range(j + 1, len(nums), 1):
                num = nums[i] + nums[j] + nums[k]
                if isPrime(num):
                    cnt += 1
    return cnt



def isPrime(num):
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True
