def diffuse(x,y):
    from collections import deque
    global n
    start=(x,y) #x,y,distance
    visit=set()
    que=deque()
    que.append(start)
    dxdy=[[1,0],[-1,0],[0,1],[0,-1]]
    while que:
        x,y=que.popleft()
        mat[x][y]=0
        if (x,y) not in visit:
            visit.add((x,y))
            for i in range(4):
                dx,dy=x+dxdy[i][0],y+dxdy[i][1]
                if dx>=0 and dx<n and dy>=0 and dy<n and mat[dx][dy]=='1':
                    que.append((dx,dy))
    return len(visit)

n=int(input())
mat=[]
for _ in range(n):
    mat.append(list(input()))
ans=[]
for i in range(n):
    for j in range(n):
        if mat[i][j]=='1':
            ans.append(diffuse(i,j))
print(len(ans),' '.join([str(i) for i in sorted(ans)]))