import queue


def solution(priorities, location):
    cnt = 0

    while priorities:
        max_num = max(priorities)
        if priorities[0] < max_num:
            priorities.append(priorities[0])
            location = locate(priorities, location)
            print(location)
            del priorities[0]
        elif priorities[0] == max_num and location != 0:
            location = locate(priorities, location)
            print(location)
            del priorities[0]
            cnt += 1
        elif priorities[0] == max_num and location == 0:
            del priorities[0]
            cnt += 1
            return cnt


def locate(priorities, location):
    if location - 1 < 0:
        return len(priorities) - 2
    else:
        return location - 1
