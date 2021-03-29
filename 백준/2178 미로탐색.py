from collections import deque
n,m=map(int,input().split())
mat=[]
for _ in range(n):
    mat.append(list(input()))
start=(0,0,1) #x,y,distance
visit=set()
que=deque()
que.append(start)
dxdy=[[1,0],[-1,0],[0,1],[0,-1]]
while que:
    x,y,dist=que.popleft()
    if x==n-1 and y==m-1:
        print(dist)
        break
    if (x,y) not in visit:
        visit.add((x,y))
        for i in range(4):
            dx,dy=x+dxdy[i][0],y+dxdy[i][1]
            if dx>=0 and dx<n and dy>=0 and dy<m and mat[dx][dy]=='1':
                que.append((dx,dy,dist+1))