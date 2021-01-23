def check(answer):
    for i in answer:
        x, y, structure = i
        # 기둥(0)
        if structure == 0:#땅이거나 아래가 기둥 혹은 보, 옆이 보
            if y == 0 or [x-1, y, 1] in answer or [x, y, 1] in answer or [x, y-1, 0] in answer:
                continue
            return False
        # 보(1)
        else:#보 아래 좌 혹은 우가 기둥
            if [x, y-1, 0] in answer or [x+1, y-1, 0] in answer:
                continue
                #양 옆이 보
            if [x-1, y, 1] in answer and [x+1, y, 1] in answer:
                continue
            return False
    return True
    
def solution(n, build_frame):
    answer = []
    for i in build_frame:
        x, y, structure, setting = i[0], i[1], i[2], i[3]
        # 설치
        if setting == 1:
            answer.append([x, y, structure])
            if not check(answer):
                answer.remove([x, y, structure])
        # 삭제
        else:
            answer.remove([x, y, structure])
            if not check(answer):
                answer.append([x, y, structure])
        #print(answer)
    answer.sort(key=lambda x:(x[0],x[1],x[2]))
    return answer