def solution(phone_number):
    arr = []
    num = len(phone_number)
    for i in range(0, num - 4, 1):
        arr.append("*")
    arr.append(phone_number[num-4:num])
    answer = "".join(arr)
    return answer