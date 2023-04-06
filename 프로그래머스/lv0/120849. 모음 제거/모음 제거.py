def solution(my_string):
    sum = ["a", "e", "i", "o", "u"]
    for i in sum:
        my_string = my_string.replace(i, "")
    return my_string