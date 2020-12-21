# 무지의 먹방 라이브
# 효율성 테슽 실패....
def solution(food_times, k):
    time=0
    pointer=0
    if sum(food_times)<k:
        return -1
    while time!=k+1:
        if pointer==len(food_times):
            pointer=0
        if sum(food_times)==0:
            return -1
        if food_times[pointer]==0:
            pointer+=1
        else:
            food_times[pointer]-=1
            pointer+=1
            time+=1
    return pointer

print(solution([3,1,1,1,2,4,3],12))