import heapq

t=int(input())
dx=[0,0,1,-1]
dy=[1,-1,0,0]
for _ in range(t):
    n=int(input())
    mat=[[i for i in list(map(int,input().split()))] for _ in range(n)]
    q=[]
    heapq.heappush(q,(mat[0][0],0,0))
    visit=set()
    visit.add((0,0))
    while q:
        cost,x,y=heapq.heappop(q)
        if x==n-1 and y==n-1:
            print(cost)
            break
        for i in range(4):
            nx,ny=x+dx[i],y+dy[i]
            if nx>=0 and nx<n and ny>=0 and ny<n and (nx,ny) not in visit:
                heapq.heappush(q,(cost+mat[nx][ny],nx,ny))
                visit.add((nx,ny))
        
