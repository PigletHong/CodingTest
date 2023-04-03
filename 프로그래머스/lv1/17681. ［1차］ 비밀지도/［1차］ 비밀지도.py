import string

def solution(n, arr1, arr2):
    map1 = []
    map2 = []
    answer = []
    for i in arr1:
        num = convert(i, 2)
        if len(num) < n:
            map1.append(((n - len(num)) * "0") + num)
        else:
            map1.append(num)

    for i in arr2:
        num = convert(i, 2)
        if len(num) < n:
            map2.append(((n - len(num)) * "0") + num)
        else:
            map2.append(num)

    for i in range(0, n, 1):
        result = int(map1[i]) + int(map2[i])
        result = str(result)
        if len(result) < n:
            result = (((n - len(result)) * "0") + result)
        result = str(result).replace("0", " ", n)
        result = result.replace("1", "#", n)
        result = result.replace("2", "#", n)
        answer.append(result)
    return answer


tmp = string.digits + string.ascii_lowercase
def convert(num, base):
    q, r = divmod(num, base)
    if q == 0:
        return tmp[r]
    else:
        return convert(q, base) + tmp[r]