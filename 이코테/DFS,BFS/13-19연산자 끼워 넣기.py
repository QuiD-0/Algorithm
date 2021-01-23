'''
연산자 끼워 넣기
사용한 자료구조: DFS
시간 복잡도: O(N^2)
'''

def solv(num,idx):
    global maxcount,mincount,x
    if idx==x:
        maxcount=max(maxcount,num)
        mincount=min(mincount,num)
        return
    else:
        # 모든 연산을 해주고 그중 최대 최소 갱신
        if op[0]:
            op[0]-=1
            solv(num+numl[idx],idx+1)
            op[0]+=1
        if op[1]:
            op[1]-=1
            solv(num-numl[idx],idx+1)
            op[1]+=1
        if op[2]:
            op[2]-=1
            solv(num*numl[idx],idx+1)
            op[2]+=1
        if op[3]:
            op[3]-=1
            solv(int(num/numl[idx]),idx+1)
            op[3]+=1

import sys
x=int(input())
numl=list(map(int,input().split()))
op=list(map(int,input().split()))
maxcount=-sys.maxsize-1
mincount=sys.maxsize
solv(numl[0],1)
print(maxcount)
print(mincount)
