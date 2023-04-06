def solution(progresses, speeds):
    stack_progresses = []
    stack_speed = []
    cnt = 0
    answer = []
    for i in range(len(progresses) - 1, -1, -1):
        stack_progresses.append(progresses[i])
        stack_speed.append(speeds[i])

    while len(stack_progresses) > 0:
        for i in range(len(stack_progresses) - 1, -1, -1):
            stack_progresses[i] += stack_speed[i]
            if stack_progresses[len(stack_progresses) - 1] >= 100:
                stack_progresses.pop()
                stack_speed.pop()
                cnt += 1
        if cnt != 0:
            answer.append(cnt)
            cnt = 0


    return answer