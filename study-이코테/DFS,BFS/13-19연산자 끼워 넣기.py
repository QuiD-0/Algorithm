'''
연산자 끼워 넣기
사용한 자료구조: DFS
시간 복잡도: O(N)
'''

import sys
x=int(input())
numl=list(map(int,input().split()))
op=list(map(int,input().split()))

def solv(num,idx,op):
    global maxcount,mincount
    if idx==x:
        maxcount=max(maxcount,num)
        mincount=min(mincount,num)
        return
    else:
        if op[0]:
            op[0]-=1
            solv(num+numl[idx],idx+1,op)
            op[0]+=1
        if op[1]:
            op[1]-=1
            solv(num-numl[idx],idx+1,op)
            op[1]+=1
        if op[2]:
            op[2]-=1
            solv(num*numl[idx],idx+1,op)
            op[2]+=1
        if op[3]:
            op[3]-=1
            solv(int(num/numl[idx]),idx+1,op)
            op[3]+=1

maxcount=-sys.maxsize-1
mincount=sys.maxsize

solv(numl[0],1,op)
print(maxcount)
print(mincount)
