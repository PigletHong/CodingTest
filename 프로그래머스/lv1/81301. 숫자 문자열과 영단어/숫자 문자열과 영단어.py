def solution(s):
    return int(convert(s))


def convert(string):
    string = string.replace("zero", "0")
    string = string.replace("one", "1")
    string = string.replace("two", "2")
    string = string.replace("three", "3")
    string = string.replace("four", "4")
    string = string.replace("five", "5")
    string = string.replace("six", "6")
    string = string.replace("seven", "7")
    string = string.replace("eight", "8")
    string = string.replace("nine", "9")
    return string