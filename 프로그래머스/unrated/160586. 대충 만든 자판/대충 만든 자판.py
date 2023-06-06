def solution(keymap, targets):

    answer = []
    
    for i in targets:
        tmp = 0
        for alpha in i:
            position = 1000
            for index, k in enumerate(keymap):
                if alpha in k and (k.index(alpha) < position and position > -1):
                    position = k.index(alpha) + 1
            if position == 1000:
                tmp = -1
                break
            else:
                tmp += position
        answer.append(tmp)
    return answer