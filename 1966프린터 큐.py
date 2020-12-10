from collections import deque
x=int(input())
while(x):
    inl=list(map(int,input().split()))
    impo=deque(map(int,input().split()))
    q=deque(i for i in range(inl[0]))
    # 처리
    count=1
    print(impo,q,inl[1])
    while(True):
        if inl[1]==q[0] and max(impo)==impo[0]:
            print(count)
            break
        elif max(impo)==impo[0]:
                q.popleft()
                impo.popleft()
                count+=1
        else:
            q.append(q.popleft())
            impo.append(impo.popleft())
    x-=1
