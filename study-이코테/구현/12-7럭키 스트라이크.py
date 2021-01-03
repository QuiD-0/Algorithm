# 럭키 스트라이크
# 사용한 자료구조: 리스트
# 시간 복잡도: O(1)

num=list(map(int,input()))
if sum(num[0:len(num)//2])==sum(num[len(num)//2:]):
    print("LUCKY")
else:
    print("READY")
