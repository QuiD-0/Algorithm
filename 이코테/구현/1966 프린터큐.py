# 프린터큐
# 사용한 자료구조: 덱
# 시간 복잡도: O(N)

# 덱을 사용하여 pop(0)대신 사용
from collections import deque
x=int(input())
while(x):
    inl=list(map(int,input().split()))
    impo=deque(map(int,input().split()))
    q=deque(i for i in range(inl[0]))
    # 처리
    count=1
    while(True):
        # 찾으려는 수이고 중요도가 가장 높을때
        if inl[1]==q[0] and max(impo)==impo[0]:
            print(count)
            break
        # 중요도가 가장 높을때 프린트
        elif max(impo)==impo[0]:
                q.popleft()
                impo.popleft()
                count+=1
        # 중요도도 가장 높지않고 찾는 수도 아닌 경우
        else: 
            q.append(q.popleft())
            impo.append(impo.popleft())
    x-=1
